package ch06_5_instance_static;

public class Car {
	// 필드
	String model;
	int speed;

	// 생성자
	Car(String model) {
		this.model = model;
	}

	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 0; i < 5; i++) {
			this.setSpeed((i + 1) * 10);
			System.out.printf("%S가 달립니다 (시속 %d km/h)\n", this.model, this.speed);

		}
	}

}