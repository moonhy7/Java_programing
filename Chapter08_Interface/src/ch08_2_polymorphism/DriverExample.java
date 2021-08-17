package ch08_2_polymorphism;

// �������̽�
interface Vehicle { 
	public void run(); // �߻� �޼ҵ�
}

// ������ Ŭ���� - �Ű������� �������̽� ���
class Driver {
	public void drive(Vehicle vehicle) { // main �޼ҵ忡�� vehicle �ڸ��� Bus ��ü�� Taxi ��ü�� ������ ����
		if(vehicle instanceof Bus) { 
			Bus bus = (Bus) vehicle; // �Ű� ������ Bus ��ü�� ���´ٸ� ���� Ÿ�� ��ȯ ����
			bus.checkFare(); // BusŸ������ ��������ȯ�� �� �����μ� Bus Ŭ������ �޼ҵ带 ���������̴�. 
			// ((Bus)vehicle).checkFare(); // �̷��� �� �ٷ� �� ���� ����
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
		
		driver.drive(bus); // ��������� üũ�մϴ�. ������ �޸��ϴ�.
		// drive() �޼ҵ��� �Ű� ������ bus�� ���������Ƿ� Bus Ÿ������ ����ȯ ����
		driver.drive(taxi); // �ýð� �޸��ϴ�.
		// taxi�� Bus Ÿ������ ����ȯ �ȵǼ� checkFare() ��¾ȵ�
		
		Vehicle vehicle = new Bus(); // �ڵ� ����ȯ
	}
}





