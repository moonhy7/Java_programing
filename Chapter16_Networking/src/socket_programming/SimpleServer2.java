package socket_programming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
	public static void main(String[] args) throws IOException {

		String str = "�ȳ��ϼ���? �ݰ����ϴ�^^";
		
		ServerSocket server = new ServerSocket(8111);
		System.out.println("���� �غ� �Ϸ�");
		
		Socket socket = server.accept(); // ����ϱ� ����
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
		
		// Ŭ���̾�Ʈ IP �ּ�
		System.out.println(socket.getInetAddress());
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeUTF(str);
		dos.close();
		out.close();
		
		socket.close();
		server.close();
		
		System.out.println("���� ����");
	
	}
}	
