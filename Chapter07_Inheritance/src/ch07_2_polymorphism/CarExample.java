package ch07_2_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�� ����", 15);
				break;
			case 2:
				System.out.println("�� ������ KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�� ������", 13);
				break;
			case 3:
				System.out.println("�� ���� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�� ����", 14);
				break;
			case 4:
				System.out.println("�� ������ KumhoTire �� ��ü");
				car.backLeftTire = new KumhoTire("�ڿ�����", 17);
			}
			System.out.println("------------");// ȸ���� ��µǴ� ���� ����
		}

	}

}