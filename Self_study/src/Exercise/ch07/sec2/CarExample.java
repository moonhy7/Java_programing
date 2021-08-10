package Exercise.ch07.sec2;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // Car ��ü ����
		
		for(int i=1; i<=5; i++) { // Car ��ü�� run() �޼ҵ� 5�� �ݺ� ����
			int problemLocation = car.run();
		
			switch(problemLocation) {
			case 1: // �� ���� Ÿ�̾ ��ũ������ HankookTire�� ��ü
				System.out.println("�� ���� Ÿ�̾ HankokTire�� ��ü");
				car.frontLeft = new HankookTire("�� ����", 15);
				break;
			case 2: // �� ������ Ÿ�̾ ��ũ������ KumhoTire�� ��ü
				System.out.println("�� ������ Ÿ�̾ KumhoTire�� ��ü");
				car.frontRight = new KumhoTire("�� ������", 13);
				break;
			case 3: // �� ���� Ÿ�̾ ��ũ������ HankookTire�� ��ü
				System.out.println("�� ���� Ÿ�̾ HankokTire�� ��ü");
				car.backLeft = new HankookTire("�� ����", 14);
				break;
			case 4: // �� ������ Ÿ�̾ ��ũ������ KumhoTire�� ��ü
				System.out.println("�� ������ Ÿ�̾ KumhoTire�� ��ü");
				car.backRight = new KumhoTire("�� ������", 17);
				break;
			} 
			System.out.println("------------------------------------");
		}
	}
}
