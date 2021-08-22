package ch09_2_anonymous.anonymous_interface;

interface RemoteControl {
	public void turnOn();
	public void turnOff();
}

public class Anonymous2 {
	// 방법 1. 필드의 초기값으로 익명 구현 객체를 생성해서 대입하기	
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	// 방법 2. 메소드 내에서 로컬 변수를 선언할 때 초기값으로 익명 구현 객체를 생성해서 대입
	void method1() {
		RemoteControl localVar = new RemoteControl() { // 로컬 변수 선언
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.turnOn(); // 로컬 변수 사용
		localVar.turnOff();
	}
	
	// 방법 3. 메소드의 매개 값으로 익명 구현 객체를 생성해서 대입
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
