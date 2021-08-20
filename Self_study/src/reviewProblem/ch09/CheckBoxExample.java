package reviewProblem.ch09;

import reviewProblem.ch09.CheckBox.OnSelectListener;

class CheckBox {
	OnSelectListener listener; // 인터페이스 타입 필드 선언
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener {
		void onSelect(); // 추상 메소드 
	}
}

// 구현 클래스
class BackgroundChangeListener implements OnSelectListener {
	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
}

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}
