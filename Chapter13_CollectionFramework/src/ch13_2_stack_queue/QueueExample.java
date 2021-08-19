package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	String command;
	String to;
	
	Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> msgQue = new LinkedList<Message>();
		
		//�ֱ�
		msgQue.offer(new Message("sendMail","ȫ�浿"));
		msgQue.offer(new Message("sendSMS","ȫ�浿"));
		msgQue.offer(new Message("sendKakaotalk","ȫ�α�"));
		
		while(!msgQue.isEmpty()) {
			//������
			Message msg = msgQue.poll();
			switch (msg.command) {
				case "sendMail" :
					System.out.println(msg.to + "�Կ��� ������ �����ϴ�.");
					break;
				case "sendSMS" :
					System.out.println(msg.to + "�Կ��� SMS�� �����ϴ�.");
					break;
				case "sendKakaotalk" :
					System.out.println(msg.to + "�Կ��� īī������ �����ϴ�.");
					break;
			}
		}
	}
}
