package ch06_4_method;

public class Car1Example {
	public static void main(String[] args) throws InterruptedException {
		Car1 myCar = new Car1();
		
		myCar.setGas(10);
		
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		
		if(myCar.isLeftGas() ) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
