package reviewProblem.ch09;

public class chatting {
	void startChat(String chatId) { // �޼ҵ� ����
		// String nickName = null; // ���� ������ final�� ���� �ǹǷ�  
		// nickName = chatId; // �̷��� ���� ���� ������ �� ���� �߻�
		String nickName = chatId; // �̷��� �� �ٷ� �ٷ� �������־���� 
	
		class Chat { // ��ø Ŭ����
			public void start() {
				while (true) { 
					String inputData = "�ȳ��ϼ���"; 
					String message = "[" + nickName +"]" + inputData;
					sendMessage(message);
				}
			}
			void sendMessage(String message) {}
		}

		Chat chat = new Chat();
		chat.start();

	}
}
