package ch08_1_interface;

public class MyClass {
	// �������̽��� ��� ���� 4����
	
	// 1. �ʵ�� ���
	RemoteControl rc = new Television();
	
	// �⺻ ������
	MyClass() {
		
	}
	
	// 2. �����ڷ� ���
	MyClass(RemoteControl rc) { // �Ű������� �������̽� Ÿ���� ��
		this.rc = rc;
		rc.turnOn(); // �������̽��� �޼ҵ� ȣ��
		rc.setVolume(5);
	}
	
	// 3. �޼ҵ� ������ ���� ������ ���
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn(); // Audio�� turnOn()�� �����
		rc.setVolume(5); // Audio�� setVolume(5)�� �����
	}
	
	// 4. �޼ҵ��� �Ű����� Ÿ������ ���
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}


