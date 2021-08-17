package ch08_2_polymorphism;

// 인터페이스
interface Vehicle { 
	public void run(); // 추상 메소드
}

// 운전자 클래스 - 매개변수로 인터페이스 사용
class Driver {
	public void drive(Vehicle vehicle) { // main 메소드에서 vehicle 자리에 Bus 객체와 Taxi 객체를 보내줄 예정
		if(vehicle instanceof Bus) { 
			Bus bus = (Bus) vehicle; // 매개 값으로 Bus 객체가 들어온다면 강제 타입 변환 가능
			bus.checkFare(); // Bus타입으로 강제형변환을 한 이유로서 Bus 클래스의 메소드를 쓰기위함이다. 
			// ((Bus)vehicle).checkFare(); // 이렇게 한 줄로 쓸 수도 있음
			vehicle.run();
		} else {
			vehicle.run(); // 인터페이스의 메소드 호출
		}
	}
}

// 구현 클래스
class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}

//구현 클래스
class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

// 실행 테스트 클래스
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver(); // 운전자 객체 생성
		
		Bus bus = new Bus(); // 구현 객체 생성
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 승차요금을 체크합니다. 버스가 달립니다.
		// drive() 메소드의 매개 값으로 bus를 대입했으므로 Bus 타입으로 형변환 가능
		driver.drive(taxi); // 택시가 달립니다.
		// taxi는 Bus 타입으로 형변환 안되서 checkFare() 출력안됨
		
		Vehicle vehicle = new Bus(); // 자동 형변환
	}
}





