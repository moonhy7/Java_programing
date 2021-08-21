package socket_programming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(8111);
			
			// 8111 ��Ʈ�� Ŭ���̾�Ʈ�� �����ϱ⸦ ������ ��ٸ��°���
			System.out.println("Ŭ���̾�Ʈ ���� �����...");
			Socket clientSocket = serverSocket.accept();
			
			System.out.println("����Ǿ����ϴ�." + serverSocket);

			
			clientSocket.close();
			serverSocket.close();
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
