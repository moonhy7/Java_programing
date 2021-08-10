package Exercise.ch07.sec1;

public class SportsCar extends Car {
	@Override
	public void speedUp() {speed += 10;}
	
//	@Override
//	public void stop() { // 메소드 재정의가 불가능하다.
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
 }