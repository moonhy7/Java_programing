package socket_programming;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketTest {
	public static void main(String[] args) {

		try {
			Socket socket = new Socket("localhost", 8111);
			System.out.println("����Ǿ����ϴ�.\n" + socket);
			socket.close();
		} catch(IOException ex) {}
	}
}
