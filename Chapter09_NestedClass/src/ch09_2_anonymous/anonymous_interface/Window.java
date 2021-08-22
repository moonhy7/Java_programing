package ch09_2_anonymous.anonymous_interface;

public class Window {
	// �����쿡�� �� ���� ��ư�� �����Ƿ� 2���� Button ��ü ����
	Button button1 = new Button();
	Button button2 = new Button();
	
	// button1�� Ŭ�� �̺�Ʈ ó���� �ʵ�� ������ �͸� ���� ��ü�� ���
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override 
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	// button2�� Ŭ�� �̺�Ʈ ó���� setter �޼ҵ��� �Ű������� �� �͸� ���� ��ü�� ��� 
	Window() {
		button1.setOnClickLister(listener); // �Ű������� �ʵ带 ����
		button2.setOnClickLister(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}
