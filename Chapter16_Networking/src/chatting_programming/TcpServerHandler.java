package chatting_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;

import com.framework.TcpApplication;

/**
 * AppServer로부터 전달 받은 소켓을 이용하여
 * 클라이언트의 접속 정보 및 송수신 기능을 관리한다.
 */
public class TcpServerHandler implements Runnable {

	/* 클라이언트 ID를 키(K)로 하는 송신(V)을 위한 맵 자료구조
	 */
	public static HashMap<String, PrintWriter> sendMap = new HashMap<>();
    
	// 클라이언트와 연결된 소켓 객체
	private Socket sock;
	
	// 클라이언트 IP 주소
	private String cAddr;
	
	// 클라이언트 ID
	private String id;

	/* 생성자
	 * 받아 온 소켓을 맵에 저장
	 */
	public TcpServerHandler(Socket cSocket) {
		this.sock = cSocket;
		this.cAddr = sock.getInetAddress().getHostAddress();
	}

	/*
	 * 참여자 입/퇴실 관리
	 * 브로드캐스팅
	 * 참여자 송수신 관리
	 */
	@Override
	public void run() {
		try {
			// 1. 송신 스트림 얻기
			PrintWriter    pw = new PrintWriter(
							    new OutputStreamWriter(
							    sock.getOutputStream()));
			// 2. 수신 스트림 얻기
			BufferedReader br = new BufferedReader(
								new InputStreamReader(
								sock.getInputStream()));
			
			
			// 3. 클라이언트 접속정보 저장
			id = br.readLine();
//			System.out.println(id);
			
			TcpServerHandler.sendMap.put(id, pw);
			
			// 4. 클라이언트 입장정보를 브로드캐스팅
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + 
					"[" + id + "] 님이 들어 오셨습니다.");
			System.out.println(TcpApplication.timeStamp() + cAddr + " ← connected");
			System.out.println(TcpApplication.timeStamp() + 
					"참여인원: " + sendMap.size() + "명");
			
			// 5. 수신/송신
			String line = null;
			while((line = br.readLine()) != null){
				// 퇴장하는 경우
				if(line.equalsIgnoreCase("/quit")) {
					// 퇴장정보 브로드캐스팅
					TcpServerHandler.broadCast(TcpApplication.timeStamp() + 
							"[" + id + "] 님이 나가셨습니다.");
					break;
				}
				// 귓속말 하는 경우
				else if(line.indexOf("/to") > -1) {
					// 귓속말 메서드 호출
					whisper(id, line);
				}
				// 일반 메시지 전송
				else {
					String msg = "[" + id + "]" + " " + line;
					TcpServerHandler.broadCast(msg);
				}
			}
			
			/* 퇴장하는 경우 처리
			 */
			System.out.println(TcpApplication.timeStamp() + 
					cAddr + " → disconnected");
			// 맵 삭제
			TcpServerHandler.sendMap.remove(id);
			
			System.out.println(TcpApplication.timeStamp() + 
					"참여인원: " + sendMap.size() + "명");
			
			pw.close();
			br.close();
			sock.close();
			
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			
		}
	}
	
	/* 귓속말 전송 메서드
	 * /to IU 뭐 하니?
	 * name : 보내는 클라이언트 id
	 * msg  : 보낼 메시지 (/to IU 뭐 하니?)
	 */
	private void whisper(String name, String msg) {
		int start = msg.indexOf(" ") + 1; // 시작 위치는 첫 공백의 + 1
		int end	  = msg.indexOf(" ", start); // start 위치부터 다음 공백이 나오는 위치
		
		if(end != -1) {
			// id : 보낼 클라이언트 id
			String id	  = msg.substring(start, end);	
			String secret = msg.substring(end + 1);
			
			// sendMap으로부터 키<id>에 해당하는 PrintWriter 객체를 얻어온다.
			PrintWriter pw = TcpServerHandler.sendMap.get(id);
			// 보낼 메시지 전송
			if(pw != null) {
				pw.println(name + "님의 귓속말[^.^]" + secret);
				pw.flush();
			}
		}
	}
	
	/* 메시지 일괄 전송 메서드 
	 * : 모든 참여자에게 일괄적으로 전송
	 */
	public static void broadCast(String message) {
		// sendMap에 여러 스레드가 접근하므로 동기화(synchronized) 처리 필요
		synchronized (sendMap) {
			
			// 접속한 모든 클라이언트들에게 메시지 전송
			for(PrintWriter cpw : TcpServerHandler.sendMap.values()) {
				cpw.println(message);
				cpw.flush();
			}
		}
	}
}





