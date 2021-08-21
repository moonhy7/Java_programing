package socket_programming;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(8111);
		System.out.println("���� �غ� �Ϸ�");
		
		Socket socket = server.accept(); // ����ϱ� ����
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		// Ŭ���̾�Ʈ IP �ּ�
		System.out.println(socket.getInetAddress());
		System.out.println(socket.getLocalAddress());
		System.out.println(socket.getRemoteSocketAddress());
		
		
		// ������ ������
		byte[] arr = {1,2,3,4,5,6,7,8,9,10};
		// String[] arr2 = {"��","��","��","��","��",".","��","��","��","��"};
		
		OutputStream out = socket.getOutputStream();
		
		out.write(arr);
		out.flush();
		out.close();
		
		socket.close();
		server.close();
		
		System.out.println("���� ����");
	
	}
}	
