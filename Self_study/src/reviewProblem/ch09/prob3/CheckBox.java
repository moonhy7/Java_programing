package reviewProblem.ch09.prob3;

public class CheckBox {
	
	// 1. 중첩 인터페이스 선언
	static interface OnSelectListener {
		void onSelect();
	}
	
	// 2. 인터페이스 타입의 필드 선언
	OnSelectListener listener;
	
	// 3. setter 메소드로 외부에서 구현 객체 받아 필드에 대입
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	// 선택 이벤트 발생 메소드
	void select() {
		listener.onSelect(); // 인터페이스를 통해 구현 객체의 메소드 호출
	}
}
