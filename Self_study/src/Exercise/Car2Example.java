package Exercise;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		
		myCar.setGas(8);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�~");
			myCar.run();
		}
		
		if(!myCar.isLeftGas()) {
			System.out.println("gas�� �����ϼ���");
		}
		
		System.out.println(myCar.a);
		
	}
}
