package ch08_2_polymorphism;

interface Vehicle1 { 
	public void run();
}

class Bus1 implements Vehicle1 {
	@Override
	public void run() { // �������̽��� �߻� �޼ҵ带 �������� ��ü �޼ҵ�
		System.out.println("������ �޸��ϴ�.");
	}
	
	public void checkFare() { // �������̽��� ���� ���ο� �޼ҵ� ����
		System.out.println("��������� üũ�մϴ�.");
	}
}

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle1 vehicle = new Bus1(); // �ڵ� ����ȯ
		
		vehicle.run(); // ��ü �޼ҵ尡 �����
		// vehicle1.checkFare(); // Vehicle �������̽��� ���� �޼ҵ� ȣ��� ������ ����

		Bus1 bus = (Bus1)vehicle; // ���� ����ȯ
		
		bus.run(); 
		bus.checkFare(); // Bus Ŭ������ �ִ� �޼ҵ��̹Ƿ� ȣ�� ����
	}
}
