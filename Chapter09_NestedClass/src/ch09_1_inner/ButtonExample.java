package ch09_1_inner;

import ch09_1_inner.Button.OnClickListener;

// Button Ŭ���� ������ ����� ��ø �������̽�
class Button {
	
	//static���� ��ø �������̽��� ����(�̺�Ʈ ó�� ����)
	static interface OnClickListener { 
		void onClick(); // �������̽� �� �߻� �޼ҵ� ����
	}
	
	// �������̽� Ÿ�� �ʵ�
	OnClickListener listener; 
	
	// �������̽� Ÿ���� �Ű� ������ �޴� Setter �޼ҵ� ����
	void setOnClickListener(OnClickListener listener) { // �Ű������� ���� ��ü�� ����
		this.listener = listener; // ���� ��ü�� �޾� �ʵ忡 ����
	}
	
	// ��ư �̺�Ʈ �߻� �޼ҵ�
	void touch() { 
		listener.onClick(); // �������̽��� ���� ���� ��ü�� onClick() �޼ҵ� ȣ��
	}
}


// ���� Ŭ���� 1 - ��ȭ 
class CallListener implements OnClickListener {
	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
}

//���� Ŭ���� 1 - �޽���
class MessageListener implements OnClickListener {
	@Override
	public void onClick() {
		System.out.println("�޽����� �����ϴ�.");
	}
}

// ��ư �̺�Ʈ ó�� ���� Ŭ����
public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch(); // ��ȭ�� �̴ϴ�.
		
		btn.setOnClickListener(new MessageListener());
		btn.touch(); // �޽����� �����ϴ�.
	}
}
