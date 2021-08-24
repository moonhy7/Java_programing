package ftp_programming;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer { // 파일을 특정위치에서 찾아서 가져오기(?)
	public static final int PORT = 10001;

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(PORT);
		System.out.println("클라이언트 접속을 대기합니다...");

		Socket client = server.accept();

		System.out.println(client.getInetAddress().getHostName() + "님이 접속하셨습니다.");

		OutputStream out = client.getOutputStream();
		OutputStreamWriter outw = new OutputStreamWriter(out);
		PrintWriter pw = new PrintWriter(outw);

		FileInputStream fin = null;
		DataOutputStream dout = new DataOutputStream(out);

		/*
		 * 리소스 자동 배포 
		 */
		File rescs = new File("resources\\");
		System.out.println(rescs.list().length + "개의 파일이 있습니다.");
		
		String filePath = null;
		for(String file : rescs.list()) {

			// 파일 정보(이름/크기) 열기
			filePath = rescs.getName() + "\\" + file;
			File sendFile = new File(filePath);				
			System.out.println(sendFile.getName() + "송신 중...");

			// 파일 송신
			pw.println(sendFile);
			pw.flush();
			pw.println(sendFile.length());
			pw.flush();

			fin = new FileInputStream(filePath);
			int cnt = 0;
			for(int i=0; i<sendFile.length(); i++) {
				// 파일 읽기
				int data = fin.read();
				// 파일 쓰기
				dout.write(data);

				if(cnt % 3000 == 0) {System.out.print("■");}
				cnt++;
			}
			System.out.println("완료\n");

		}		
		
		fin.close();
		dout.close();
		pw.close();
		client.close();
		server.close();
		
		System.out.println();
		System.out.println("파일 배포 서비스 프로그램 종료");
	}
}











