package ch07_2_polymorphism;

public class Car {

	//�ڵ����� 4���� Ÿ�̾ ����
	Tire frontLeftTire = new Tire("�� ���� ", 6);
	Tire frontRightTire=new Tire("�տ�����",2);
	Tire backLeftTire=new Tire("�ڿ���",3);
	Tire backRightTire = new Tire("�ڿ�����",4);
	//������
	
	//�޼ҵ�
	//��� Ÿ�̾ 1ȸ ȸ�� ��Ű�� ���� �� Tire ��ü�� roll() �޼ҵ� ȣ��
	//false �� �����ϴ� roll() �� ���� ��� stop �޼ҵ� ȣ��, Ÿ�̾� ��ȣ ����
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if((frontLeftTire.roll())==false) {stop(); return 1;}
		if((frontRightTire.roll()==false)) {stop(); return 2; }
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�"); //��ũ ���� �� ����
	}
	
	
}