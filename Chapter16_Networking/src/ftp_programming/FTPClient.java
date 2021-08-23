package ftp_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FTPClient {
//	public static final String IP = "192.168.35.209"; // 예진
	public static final String IP = "192.168.25.30"; // 내꺼
//	public static final String IP = "192.168.0.134"; // 강사님
	
//		public static final String IP = "127.0.0.1";
	
	public static final int	PORT = 9001;

	public static void main(String[] args) {

		// 입출력 스트림
		InputStream in =null;
		OutputStream out =null;
		DataInputStream din =null;
		DataOutputStream dout =null;
		FileOutputStream fos = null;
		Scanner scan = null;

		// 소켓
		Socket socket = null;

		try {
			socket = new Socket(IP,PORT);
			scan = new Scanner(System.in);

			// 수신 
			in = socket.getInputStream();
			din = new DataInputStream(in);

			// 송신
			out = socket.getOutputStream();
			dout = new DataOutputStream(out);

			menuDisplay();
			String fileName = scan.nextLine();

			// 서버로 전송
			dout.writeUTF(fileName);
			System.out.println(timeStamp() + "파일 서버에 요청하였습니다.");
			System.out.println();

			// 파일데이터 수신
			System.out.println("파일 수신중...");
			System.out.println();
			
			fos = new FileOutputStream("C:/Temp/" +fileName);
			
			int cnt = 0;
			while(true) {
				// 읽기
				int data = din.read();
				if(data == -1) break;
				// 쓰기
				fos.write(data);
				if(cnt % 5000 == 0) {
					System.out.println("■");
				}
				cnt++;
			}
			
			System.out.println();
			System.out.println(timeStamp() + "파일 수신을 완료하였습니다." + "(" + cnt +"바이트)");
		
			System.out.println();
			System.out.println(timeStamp() + "파일 다운로드 완료");

		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(din != null) {din.close();}
				if(dout != null) {dout.close();}
				if(fos != null) {fos.close();}
				if(socket != null) {socket.close();}
			} catch(IOException ex) {ex.printStackTrace();}
		}
		System.out.println(timeStamp() + "클라이언트 파일 요청 프로그램을 종료합니다.");
	}
	private static void menuDisplay() {
		System.out.println();
		System.out.println("────────────────────────────────────");
		System.out.println();
		System.out.println(" 받고 싶은 파일의 이름(파일명, 확장자)를 입력해주세요");
		System.out.println();
		System.out.println("  [1]aaa.txt [2]bbb.txt [3]ccc.txt [4]hiking.jpg [5]image.gif");
		System.out.println();
		System.out.println("────────────────────────────────────");
		System.out.println();
		System.out.println("선택>");

	}

	/*
	 * 현재시간을 리턴해주는 메소드
	 * 반환타입: String
	 */
	private static String timeStamp() {
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		return format.format(new Date());
	}

}
