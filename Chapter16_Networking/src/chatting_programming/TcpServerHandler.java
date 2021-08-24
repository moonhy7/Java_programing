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
 * AppServer�κ��� ���� ���� ������ �̿��Ͽ�
 * Ŭ���̾�Ʈ�� ���� ���� �� �ۼ��� ����� �����Ѵ�.
 */
public class TcpServerHandler implements Runnable {

	/* Ŭ���̾�Ʈ ID�� Ű(K)�� �ϴ� �۽�(V)�� ���� �� �ڷᱸ��
	 */
	public static HashMap<String, PrintWriter> sendMap = new HashMap<>();
    
	// Ŭ���̾�Ʈ�� ����� ���� ��ü
	private Socket sock;
	
	// Ŭ���̾�Ʈ IP �ּ�
	private String cAddr;
	
	// Ŭ���̾�Ʈ ID
	private String id;

	/* ������
	 * �޾� �� ������ �ʿ� ����
	 */
	public TcpServerHandler(Socket cSocket) {
		this.sock = cSocket;
		this.cAddr = sock.getInetAddress().getHostAddress();
	}

	/*
	 * ������ ��/��� ����
	 * ��ε�ĳ����
	 * ������ �ۼ��� ����
	 */
	@Override
	public void run() {
		try {
			// 1. �۽� ��Ʈ�� ���
			PrintWriter    pw = new PrintWriter(
							    new OutputStreamWriter(
							    sock.getOutputStream()));
			// 2. ���� ��Ʈ�� ���
			BufferedReader br = new BufferedReader(
								new InputStreamReader(
								sock.getInputStream()));
			
			
			// 3. Ŭ���̾�Ʈ �������� ����
			id = br.readLine();
//			System.out.println(id);
			
			TcpServerHandler.sendMap.put(id, pw);
			
			// 4. Ŭ���̾�Ʈ ���������� ��ε�ĳ����
			TcpServerHandler.broadCast(TcpApplication.timeStamp() + 
					"[" + id + "] ���� ��� ���̽��ϴ�.");
			System.out.println(TcpApplication.timeStamp() + cAddr + " �� connected");
			System.out.println(TcpApplication.timeStamp() + 
					"�����ο�: " + sendMap.size() + "��");
			
			// 5. ����/�۽�
			String line = null;
			while((line = br.readLine()) != null){
				// �����ϴ� ���
				if(line.equalsIgnoreCase("/quit")) {
					// �������� ��ε�ĳ����
					TcpServerHandler.broadCast(TcpApplication.timeStamp() + 
							"[" + id + "] ���� �����̽��ϴ�.");
					break;
				}
				// �ӼӸ� �ϴ� ���
				else if(line.indexOf("/to") > -1) {
					// �ӼӸ� �޼��� ȣ��
					whisper(id, line);
				}
				// �Ϲ� �޽��� ����
				else {
					String msg = "[" + id + "]" + " " + line;
					TcpServerHandler.broadCast(msg);
				}
			}
			
			/* �����ϴ� ��� ó��
			 */
			System.out.println(TcpApplication.timeStamp() + 
					cAddr + " �� disconnected");
			// �� ����
			TcpServerHandler.sendMap.remove(id);
			
			System.out.println(TcpApplication.timeStamp() + 
					"�����ο�: " + sendMap.size() + "��");
			
			pw.close();
			br.close();
			sock.close();
			
		} catch(IOException ex) {
			ex.printStackTrace();
		} finally {
			
		}
	}
	
	/* �ӼӸ� ���� �޼���
	 * /to IU �� �ϴ�?
	 * name : ������ Ŭ���̾�Ʈ id
	 * msg  : ���� �޽��� (/to IU �� �ϴ�?)
	 */
	private void whisper(String name, String msg) {
		int start = msg.indexOf(" ") + 1; // ���� ��ġ�� ù ������ + 1
		int end	  = msg.indexOf(" ", start); // start ��ġ���� ���� ������ ������ ��ġ
		
		if(end != -1) {
			// id : ���� Ŭ���̾�Ʈ id
			String id	  = msg.substring(start, end);	
			String secret = msg.substring(end + 1);
			
			// sendMap���κ��� Ű<id>�� �ش��ϴ� PrintWriter ��ü�� ���´�.
			PrintWriter pw = TcpServerHandler.sendMap.get(id);
			// ���� �޽��� ����
			if(pw != null) {
				pw.println(name + "���� �ӼӸ�[^.^]" + secret);
				pw.flush();
			}
		}
	}
	
	/* �޽��� �ϰ� ���� �޼��� 
	 * : ��� �����ڿ��� �ϰ������� ����
	 */
	public static void broadCast(String message) {
		// sendMap�� ���� �����尡 �����ϹǷ� ����ȭ(synchronized) ó�� �ʿ�
		synchronized (sendMap) {
			
			// ������ ��� Ŭ���̾�Ʈ�鿡�� �޽��� ����
			for(PrintWriter cpw : TcpServerHandler.sendMap.values()) {
				cpw.println(message);
				cpw.flush();
			}
		}
	}
}





