package ch08_2_polymorphism;

interface Vehicle1 { 
	public void run();
}

class Bus1 implements Vehicle1 {
	@Override
	public void run() { // 인터페이스의 추상 메소드를 재정의한 실체 메소드
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() { // 인터페이스에 없는 새로운 메소드 선언
		System.out.println("승차요금을 체크합니다.");
	}
}

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle1 vehicle = new Bus1(); // 자동 형변환
		
		vehicle.run(); // 실체 메소드가 실행됨
		// vehicle1.checkFare(); // Vehicle 인터페이스에 없는 메소드 호출시 컴파일 에러

		Bus1 bus = (Bus1)vehicle; // 강제 형변환
		
		bus.run(); 
		bus.checkFare(); // Bus 클래스에 있는 메소드이므로 호출 가능
	}
}
