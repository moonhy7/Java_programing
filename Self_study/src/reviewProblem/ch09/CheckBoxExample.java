package reviewProblem.ch09;

import reviewProblem.ch09.CheckBox.OnSelectListener;

class CheckBox {
	OnSelectListener listener; // �������̽� Ÿ�� �ʵ� ����
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener {
		void onSelect(); // �߻� �޼ҵ� 
	}
}

// ���� Ŭ����
class BackgroundChangeListener implements OnSelectListener {
	@Override
	public void onSelect() {
		System.out.println("����� �����մϴ�.");
	}
}

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}
