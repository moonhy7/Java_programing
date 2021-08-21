package socket_programming;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;


public class SimpleClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("192.168.0.249", 8111);
		System.out.println("서버연결 완료");
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String message = dis.readUTF();
		System.out.println("받은 메시지: " + message);
		
		dis.close();
		socket.close();
		
		System.out.println("클라이언트 종료");
	}
}
