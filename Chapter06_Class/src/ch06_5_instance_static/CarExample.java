package ch06_5_instance_static;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("������");
		Car yourCar= new Car("����");
		
		myCar.run();
		yourCar.run();

	}

}