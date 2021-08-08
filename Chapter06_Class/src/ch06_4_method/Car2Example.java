package ch06_4_method;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.keyTurnOn();
		myCar.run();
//		System.out.println(myCar.speed);
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
