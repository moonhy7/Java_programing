package Exercise.ch06;

public class Car4 {
	// �ʵ�
	int speed;
	
	// �޼ҵ�
	void run() {
		System.out.println(speed + "km/hour�� �޸��ϴ�.");
	}
	
	// main �޼ҵ�
	public static void main(String[] args) {
		Car4 myCar = new Car4(); // ��ü ����
		myCar.speed = 60; // ���� ������ ���� ����
		myCar.run(); // 60km/hour�� �޸��ϴ�.
	}
	
	
	
	
	// �ʵ�
	int gas;

	//�޼ҵ�
	void setSpeed(int speed) {
		System.out.println("speed : " + speed);
	}
}

