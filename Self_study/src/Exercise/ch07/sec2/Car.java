package Exercise.ch07.sec2;

public class Car {
	//�ʵ�
	Tire frontLeft = new Tire("�� ����", 6); // �ڵ����� 4���� Ÿ�̾� ��ü ����
	Tire frontRight = new Tire("�� ������", 2); 
	Tire backLeft = new Tire("�� ����", 3); 
	Tire backRight = new Tire("�� ������", 4);
	//������
	
	//�޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]"); 
		// ��� Ÿ�̾ 1ȸ�� ����Ǿ�� �ϹǷ� �� Tire ��ü�� roll() �޼ҵ带 ȣ��
		// false(��ũ)�� �����ϴ°� ������ stop() �޼ҵ� ȣ�� �� �ش� Ÿ�̾� ��ȣ�� ����
		if(frontLeft.roll() == false) {stop(); return 1;}
		if(frontRight.roll() == false) {stop(); return 2;}
		if(backLeft.roll() == false) {stop(); return 3;}
		if(backRight.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]"); // ��ũ������ ���� 
	}
}
