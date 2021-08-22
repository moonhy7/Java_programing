package ch09_2_anonymous.anonymous_interface;

interface RemoteControl {
	public void turnOn();
	public void turnOff();
}

public class Anonymous2 {
	// ��� 1. �ʵ��� �ʱⰪ���� �͸� ���� ��ü�� �����ؼ� �����ϱ�	
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	// ��� 2. �޼ҵ� ������ ���� ������ ������ �� �ʱⰪ���� �͸� ���� ��ü�� �����ؼ� ����
	void method1() {
		RemoteControl localVar = new RemoteControl() { // ���� ���� ����
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
		localVar.turnOn(); // ���� ���� ���
		localVar.turnOff();
	}
	
	// ��� 3. �޼ҵ��� �Ű� ������ �͸� ���� ��ü�� �����ؼ� ����
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
