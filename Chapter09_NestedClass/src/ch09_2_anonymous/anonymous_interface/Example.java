package ch09_2_anonymous.anonymous_interface;

interface RemoteControl_ {
	public void turnOn();
}

class TV implements RemoteControl_ {
	@Override
	public void turnOn() {
		System.out.println("f");
	}
} // 구현 클래스 선언

public class Example { // 일반적인 방법은 이렇게 A라는 클래스를 명시한 후 사용함
	RemoteControl_ field_ = new TV(); // 구현 객체 생성 후 인터페이스 타입의 필드에 대입
	
	void method_() {
		RemoteControl_ localVar = new TV(); // 구현 객체 생성 후 인터페이스 타입의 로컬 변수에 대입
	}
	
	// 방법 1. 필드의 초기값으로 익명 구현 객체를 생성해서 대입	
	RemoteControl_ field = new RemoteControl_() { 
		// new 연산자를 통해 중괄호 내부와 같이 선언된 구현 클래스를 객체로 생성한다.
		@Override
		public void turnOn() {} // 추상 메소드를 재정의한 실체 메소드
	};

	// 방법 2. 메소드 내에서 로컬 변수를 선언할 때 초기값으로 익명 구현 객체를 생성해서 대입
	void method() {
		RemoteControl_ localVar = new RemoteControl_() {
			@Override
			public void turnOn() {}
			// 구현 객체 생성 후 인터페이스 타입의 로컬 변수에 대입
		};
	}
	
	// 방법 3. 메소드의 매개 값으로 익명 구현 객체를 생성해서 대입
	void method1(RemoteControl_ rc) {}
	void method2() {
		method1( // method1 호출
			new RemoteControl_() { // method1() 매개값으로 익명 구현 객체를 대입
				@Override
				public void turnOn() {}
			}
		);
	}
}




