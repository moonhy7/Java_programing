package Exercise.ch06;

public class Car3Example {
	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("����ӵ�: " + speed + "km/h");
	}
}
