package ch08_2_polymorphism;

// �������̽�
interface Vehicle { 
	public void run(); // �߻� �޼ҵ�
}

// ������ Ŭ���� - �Ű������� �������̽� ���
class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			((Bus)vehicle).checkFare();
			vehicle.run();
		} else {
			vehicle.run(); // �������̽��� �޼ҵ� ȣ��
		}
	}
}

// ���� Ŭ����
class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	public void checkFare() {
		System.out.println("��������� üũ�մϴ�.");
	}
}

//���� Ŭ����
class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}

// ���� �׽�Ʈ Ŭ����
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver(); // ������ ��ü ����
		
		Bus bus = new Bus(); // ���� ��ü ����
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // ������ �޸��ϴ�.
		driver.drive(taxi); // �ýð� �޸��ϴ�.
		
		Vehicle vehicle = new Bus(); // �ڵ� ����ȯ
	}
}





