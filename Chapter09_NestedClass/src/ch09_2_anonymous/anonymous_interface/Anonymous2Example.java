package ch09_2_anonymous.anonymous_interface;

public class Anonymous2Example {
	public static void main(String[] args) {

		Anonymous2 anony = new Anonymous2(); // 객체 생성
		
		// 1. 익명 객체 필드 사용
		anony.field.turnOn(); 
		anony.field.turnOff();
		System.out.println();
		
		// 2. 익명 객체 로컬 변수 사용
		anony.method1();
		System.out.println();

		// 3. 익명 객체 매개값 사용
		anony.method2(new RemoteControl() { 
			@Override
			public void turnOn() {
				System.out.println("Smart TV를 켭니다.");
			}	
			@Override
			public void turnOff() {
				System.out.println("Smart TV를 끕니다.");
			}
		}
				);

	}
}
