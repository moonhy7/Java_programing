package Exercise.ch06;

public class Car6Example {
	public static void main(String[] args) {
		Car6 myCar = new Car6();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재속도: " + myCar.getSpeed()); // 현재속도: 0
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
	
		// 멈춤
		if(myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed()); // 현재속도: 60
	}
}
