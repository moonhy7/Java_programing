package ch09_2_anonymous.anonymous_interface;

interface RemoteControl_ {
	public void turnOn();
}

class TV implements RemoteControl_ {
	@Override
	public void turnOn() {
		System.out.println("f");
	}
} // ���� Ŭ���� ����

public class Example { // �Ϲ����� ����� �̷��� A��� Ŭ������ ����� �� �����
	RemoteControl_ field_ = new TV(); // ���� ��ü ���� �� �������̽� Ÿ���� �ʵ忡 ����
	
	void method_() {
		RemoteControl_ localVar = new TV(); // ���� ��ü ���� �� �������̽� Ÿ���� ���� ������ ����
	}
	
	// ��� 1. �ʵ��� �ʱⰪ���� �͸� ���� ��ü�� �����ؼ� ����	
	RemoteControl_ field = new RemoteControl_() { 
		// new �����ڸ� ���� �߰�ȣ ���ο� ���� ����� ���� Ŭ������ ��ü�� �����Ѵ�.
		@Override
		public void turnOn() {} // �߻� �޼ҵ带 �������� ��ü �޼ҵ�
	};

	// ��� 2. �޼ҵ� ������ ���� ������ ������ �� �ʱⰪ���� �͸� ���� ��ü�� �����ؼ� ����
	void method() {
		RemoteControl_ localVar = new RemoteControl_() {
			@Override
			public void turnOn() {}
			// ���� ��ü ���� �� �������̽� Ÿ���� ���� ������ ����
		};
	}
	
	// ��� 3. �޼ҵ��� �Ű� ������ �͸� ���� ��ü�� �����ؼ� ����
	void method1(RemoteControl_ rc) {}
	void method2() {
		method1( // method1 ȣ��
			new RemoteControl_() { // method1() �Ű������� �͸� ���� ��ü�� ����
				@Override
				public void turnOn() {}
			}
		);
	}
}




