package ch09_2_anonymous.anonymous_interface;

public class Window {
	// 윈도우에는 두 개의 버튼이 있으므로 2개의 Button 객체 생성
	Button button1 = new Button();
	Button button2 = new Button();
	
	// button1의 클릭 이벤트 처리는 필드로 선언한 익명 구현 객체가 담당
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override 
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	// button2의 클릭 이벤트 처리는 setter 메소드의 매개값으로 준 익명 구현 객체가 담당 
	Window() {
		button1.setOnClickLister(listener); // 매개값으로 필드를 대입
		button2.setOnClickLister(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
