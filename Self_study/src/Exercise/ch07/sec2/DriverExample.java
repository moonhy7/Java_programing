package Exercise.ch07.sec2;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// �Ű������� vehicle�� �޾ƾ��ϴµ� Vehicle�� �ڽ� ��ü�� bus�� taxi�� ����
		// �ڵ� Ÿ�Ժ�ȯ�� ����
		driver.drive(bus); // Vehicle vehicle = bus;
		driver.drive(taxi); // Vehicle vehicle = taxi;
	}
}
