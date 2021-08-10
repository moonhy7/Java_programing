package Exercise.ch07.sec2;

public class Taxi extends Vehicle { // Vehicle 클래스로부터 상속받음
	@Override
	public void run() { // 원래 Vehicle 클래스에 있던 run() 메소드를 오버라이딩함
		System.out.println("택시가 달립니다.");
	}
}
