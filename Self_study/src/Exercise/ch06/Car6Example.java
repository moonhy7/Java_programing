package Exercise.ch06;

public class Car6Example {
	public static void main(String[] args) {
		Car6 myCar = new Car6();
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		System.out.println("����ӵ�: " + myCar.getSpeed()); // ����ӵ�: 0
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
	
		// ����
		if(myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ�: " + myCar.getSpeed()); // ����ӵ�: 60
	}
}
