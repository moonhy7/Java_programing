package ch09_1_inner;

import ch09_1_inner.Button.OnClickListener;

// Button 클래스 내에서 선언된 중첩 인터페이스
class Button {
	
	//static으로 중첩 인터페이스로 선언(이벤트 처리 목적)
	static interface OnClickListener { 
		void onClick(); // 인터페이스 내 추상 메소드 선언
	}
	
	// 인터페이스 타입 필드
	OnClickListener listener; 
	
	// 인터페이스 타입을 매개 값으로 받는 Setter 메소드 선언
	void setOnClickListener(OnClickListener listener) { // 매개변수로 구현 객체가 들어옴
		this.listener = listener; // 구현 객체를 받아 필드에 대입
	}
	
	// 버튼 이벤트 발생 메소드
	void touch() { 
		listener.onClick(); // 인터페이스를 통해 구현 객체의 onClick() 메소드 호출
	}
}


// 구현 클래스 1 - 전화 
class CallListener implements OnClickListener {
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}

//구현 클래스 1 - 메시지
class MessageListener implements OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}

// 버튼 이벤트 처리 실행 클래스
public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch(); // 전화를 겁니다.
		
		btn.setOnClickListener(new MessageListener());
		btn.touch(); // 메시지를 보냅니다.
	}
}
