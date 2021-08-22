package ch09_2_anonymous.anonymous_interface;

public class Button {
	static interface OnClickListener {
		void onClick();
	} // 중첩 인터페이스 선언
	
	OnClickListener listener; // 인터페이스 타입 필드 선언
	
	// setter 메소드로 외부에서 구현 객체 받아 필드에 대입
	void setOnClickLister(OnClickListener listener) {
		this.listener = listener;
	}
	
	// touch를 하면 인터페이스를 통해 구현 객체의 메소드인 onClick()이 호출됨
	void touch() {
		listener.onClick();
	}
}
