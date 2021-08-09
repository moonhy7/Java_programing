package Exercise.ch06;

public class Car4 {
	// 필드
	int speed;
	
	// 메소드
	void run() {
		System.out.println(speed + "km/hour로 달립니다.");
	}
	
	// main 메소드
	public static void main(String[] args) {
		Car4 myCar = new Car4(); // 객체 생성
		myCar.speed = 60; // 참조 변수로 접근 가능
		myCar.run(); // 60km/hour로 달립니다.
	}
	
	
	
	
	// 필드
	int gas;

	//메소드
	void setSpeed(int speed) {
		System.out.println("speed : " + speed);
	}
}

