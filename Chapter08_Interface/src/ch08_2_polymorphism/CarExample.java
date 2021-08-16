package ch08_2_polymorphism;

interface Tire {
	// 추상 메소드
	public void roll(); // roll() 메소드 호출 방법 설명
}


class HanKookTire implements Tire {
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}

class KumhoTire implements Tire {
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}

class Car {
	// 필드 타입으로 Tire 인터페이스 사용 
	// 필드 값으로 한국 타이어나 금호 타이어 객체 대입 가능 
	// 자동 타입 변환이 일어남
	Tire frontLeftTire = new HanKookTire();
	Tire frontRightTire = new HanKookTire();
	Tire backLeftTire = new HanKookTire();
	Tire backRightTire = new HanKookTire();
	
	// Car 객체의 run() 메소드에서 Tire 인터페이스에서 선언된 roll() 메소드 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성 
		Car myCar = new Car();
		
		myCar.run(); // 교체 전이라 모두 한국타이어가 뜸
		System.out.println();
		
		// 초기값으로 대입한 구현 객체 대신 다른 구현 객체를 대입할 수도 있음
		// 이것이 바로 타이어 교체
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run(); // 앞 바퀴 교체 후 금호타이어로 바뀜
		System.out.println();
		
		// run() 메소드를 수정하지 않아도 다양한 roll() 메소드의 실행 결과를 얻게 됨
		// 이것이 필드의 다형성
	}
}
