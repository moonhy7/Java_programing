package reviewProblem.ch09.prob3;

public class CheckBoxExample {
	public static void main(String[] args) {
		// CheckBox 객체 생성
		CheckBox checkBox = new CheckBox();
		
		// 생성된 구현 객체(new 뒤에 써있는 것)를 setter 메소드로 받아서 필드에 대입
		checkBox.setOnSelectListener(
			new CheckBox.OnSelectListener() { // 인터페이스 타입 익명 객체 생성
				@Override
				public void onSelect() { // 실체 메소드로 재정의
					System.out.println("배경을 변경합니다.");
				}
			}
		);
		
		checkBox.select(); // '선택'이라는 이벤트 발생
	}
}
