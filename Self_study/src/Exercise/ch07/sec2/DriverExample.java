package Exercise.ch07.sec2;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 매개변수로 vehicle을 받아야하는데 Vehicle의 자식 객체인 bus와 taxi를 받음
		// 자동 타입변환된 것임
		driver.drive(bus); // Vehicle vehicle = bus;
		driver.drive(taxi); // Vehicle vehicle = taxi;
	}
}
