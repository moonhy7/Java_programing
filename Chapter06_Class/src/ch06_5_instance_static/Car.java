package ch06_5_instance_static;

public class Car {
	// �ʵ�
	String model;
	int speed;

	// ������
	Car(String model) {
		this.model = model;
	}

	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 0; i < 5; i++) {
			this.setSpeed((i + 1) * 10);
			System.out.printf("%S�� �޸��ϴ� (�ü� %d km/h)\n", this.model, this.speed);

		}
	}

}