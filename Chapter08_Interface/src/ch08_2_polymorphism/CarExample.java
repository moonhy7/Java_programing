package ch08_2_polymorphism;

interface Tire {
	// �߻� �޼ҵ�
	public void roll(); // roll() �޼ҵ� ȣ�� ��� ����
}


class HanKookTire implements Tire {
	@Override
	public void roll() {
		System.out.println("�ѱ� Ÿ�̾ �������ϴ�.");
	}
}

class KumhoTire implements Tire {
	@Override
	public void roll() {
		System.out.println("��ȣ Ÿ�̾ �������ϴ�.");
	}
}

class Car {
	// �ʵ� Ÿ������ Tire �������̽� ��� 
	// �ʵ� ������ �ѱ� Ÿ�̾ ��ȣ Ÿ�̾� ��ü ���� ���� 
	// �ڵ� Ÿ�� ��ȯ�� �Ͼ
	Tire frontLeftTire = new HanKookTire();
	Tire frontRightTire = new HanKookTire();
	Tire backLeftTire = new HanKookTire();
	Tire backRightTire = new HanKookTire();
	
	// Car ��ü�� run() �޼ҵ忡�� Tire �������̽����� ����� roll() �޼ҵ� ȣ��
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

public class CarExample {
	public static void main(String[] args) {
		// Car ��ü ���� 
		Car myCar = new Car();
		
		myCar.run(); // ��ü ���̶� ��� �ѱ�Ÿ�̾ ��
		System.out.println();
		
		// �ʱⰪ���� ������ ���� ��ü ��� �ٸ� ���� ��ü�� ������ ���� ����
		// �̰��� �ٷ� Ÿ�̾� ��ü
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run(); // �� ���� ��ü �� ��ȣŸ�̾�� �ٲ�
		System.out.println();
		
		// run() �޼ҵ带 �������� �ʾƵ� �پ��� roll() �޼ҵ��� ���� ����� ��� ��
		// �̰��� �ʵ��� ������
	}
}
