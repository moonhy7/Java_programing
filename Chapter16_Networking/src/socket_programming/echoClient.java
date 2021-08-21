package socket_programming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class echoClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("192.168.0.247", 8111);
		System.out.println("�������� �Ϸ�");
		
		// ������ ����
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		// ������ ����
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("> ");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			dos.flush();
		
			String readMsg = dis.readUTF();
			System.out.println("��������: " + readMsg);
			
			
			if(sendMsg.equalsIgnoreCase("exit")) {
				break;
			}
		}
		
//		String msg = sc.nextLine();
//		dos.writeUTF(msg);
		
		dis.close();
		dos.close();
		sc.close();
		socket.close();
		
		System.out.println("Ŭ���̾�Ʈ ����");
	}
}
