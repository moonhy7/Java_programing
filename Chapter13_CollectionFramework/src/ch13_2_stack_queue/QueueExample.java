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
		
		//³Ö±â
		msgQue.offer(new Message("sendMail","È«±æµ¿"));
		msgQue.offer(new Message("sendSMS","È«±æµ¿"));
		msgQue.offer(new Message("sendKakaotalk","È«µÎ±ú"));
		
		while(!msgQue.isEmpty()) {
			//²¨³»±â
			Message msg = msgQue.poll();
			switch (msg.command) {
				case "sendMail" :
					System.out.println(msg.to + "´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
					break;
				case "sendSMS" :
					System.out.println(msg.to + "´Ô¿¡°Ô SMS¸¦ º¸³À´Ï´Ù.");
					break;
				case "sendKakaotalk" :
					System.out.println(msg.to + "´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù.");
					break;
			}
		}
	}
}
