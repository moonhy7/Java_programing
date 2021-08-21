package socket_programming;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(8111);
		System.out.println("서버 준비 완료");
		
		Socket socket = server.accept(); // 대기하기 시작
		System.out.println("클라이언트 연결 완료");
		// 클라이언트 IP 주소
		System.out.println(socket.getInetAddress());
		System.out.println(socket.getLocalAddress());
		System.out.println(socket.getRemoteSocketAddress());
		
		
		// 데이터 보내기
		byte[] arr = {1,2,3,4,5,6,7,8,9,10};
		// String[] arr2 = {"안","녕","하","세","요",".","반","가","워","요"};
		
		OutputStream out = socket.getOutputStream();
		
		out.write(arr);
		out.flush();
		out.close();
		
		socket.close();
		server.close();
		
		System.out.println("서버 종료");
	
	}
}	
