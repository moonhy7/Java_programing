package ch07_2_polymorphism;

public class Bus extends Vehicle { // Vehicle 클래스로부터 상속받음
	@Override
	public void run() { // 원래 Vehicle 클래스에 있던 run() 메소드를 오버라이딩함
		System.out.println("버스가 달립니다.");
	}
}