package ch08_2_polymorphism;

// 인터페이스
interface Vehicle { 
	public void run(); // 추상 메소드
}

// 운전자 클래스 - 매개변수로 인터페이스 사용
class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			((Bus)vehicle).checkFare();
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
		
		driver.drive(bus); // 버스가 달립니다.
		driver.drive(taxi); // 택시가 달립니다.
		
		Vehicle vehicle = new Bus(); // 자동 형변환
	}
}





