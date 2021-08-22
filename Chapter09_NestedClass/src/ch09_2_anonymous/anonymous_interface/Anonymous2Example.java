package ch09_2_anonymous.anonymous_interface;

public class Anonymous2Example {
	public static void main(String[] args) {

		Anonymous2 anony = new Anonymous2(); // ��ü ����
		
		// 1. �͸� ��ü �ʵ� ���
		anony.field.turnOn(); 
		anony.field.turnOff();
		System.out.println();
		
		// 2. �͸� ��ü ���� ���� ���
		anony.method1();
		System.out.println();

		// 3. �͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() { 
			@Override
			public void turnOn() {
				System.out.println("Smart TV�� �մϴ�.");
			}	
			@Override
			public void turnOff() {
				System.out.println("Smart TV�� ���ϴ�.");
			}
		}
				);

	}
}
