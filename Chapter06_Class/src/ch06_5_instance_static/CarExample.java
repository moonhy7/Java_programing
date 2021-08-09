package ch06_5_instance_static;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("Æ÷¸£½¦");
		Car yourCar= new Car("º¥Ã÷");
		
		myCar.run();
		yourCar.run();

	}

}