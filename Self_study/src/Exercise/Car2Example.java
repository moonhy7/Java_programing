package Exercise;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		
		myCar.setGas(8);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다~");
			myCar.run();
		}
		
		if(!myCar.isLeftGas()) {
			System.out.println("gas를 주입하세요");
		}
		
		System.out.println(myCar.a);
		
	}
}
