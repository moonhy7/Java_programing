package homework;

public class CarExample {
	public static void main(String[] args) {

		
		Car myCar = new Car("검정", 3000);
		myCar.run();
		
		Car subCar = new Car("그레이", 1600, "현대", "아반떼");
		subCar.run();
	}
}
