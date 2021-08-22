package ch09_2_anonymous.anonymous_interface;

public class Button {
	static interface OnClickListener {
		void onClick();
	} // ��ø �������̽� ����
	
	OnClickListener listener; // �������̽� Ÿ�� �ʵ� ����
	
	// setter �޼ҵ�� �ܺο��� ���� ��ü �޾� �ʵ忡 ����
	void setOnClickLister(OnClickListener listener) {
		this.listener = listener;
	}
	
	// touch�� �ϸ� �������̽��� ���� ���� ��ü�� �޼ҵ��� onClick()�� ȣ���
	void touch() {
		listener.onClick();
	}
}
