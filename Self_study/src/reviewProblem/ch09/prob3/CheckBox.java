package reviewProblem.ch09.prob3;

public class CheckBox {
	
	// 1. ��ø �������̽� ����
	static interface OnSelectListener {
		void onSelect();
	}
	
	// 2. �������̽� Ÿ���� �ʵ� ����
	OnSelectListener listener;
	
	// 3. setter �޼ҵ�� �ܺο��� ���� ��ü �޾� �ʵ忡 ����
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	// ���� �̺�Ʈ �߻� �޼ҵ�
	void select() {
		listener.onSelect(); // �������̽��� ���� ���� ��ü�� �޼ҵ� ȣ��
	}
}
