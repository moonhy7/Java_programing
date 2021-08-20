package reviewProblem.ch09;

public class chatting {
	void startChat(String chatId) { // 메소드 선언
		// String nickName = null; // 로컬 변수는 final로 선언 되므로  
		// nickName = chatId; // 이렇게 쓰면 값을 변경할 때 에러 발생
		String nickName = chatId; // 이렇게 한 줄로 바로 선언해주어야함 
	
		class Chat { // 중첩 클래스
			public void start() {
				while (true) { 
					String inputData = "안녕하세요"; 
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
