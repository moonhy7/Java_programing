package ch08_1_interface;

public class MyClass {
	// 인터페이스의 사용 예시 4가지
	
	// 1. 필드로 사용
	RemoteControl rc = new Television();
	
	// 기본 생성자
	MyClass() {
		
	}
	
	// 2. 생성자로 사용
	MyClass(RemoteControl rc) { // 매개변수에 인터페이스 타입이 들어감
		this.rc = rc;
		rc.turnOn(); // 인터페이스의 메소드 호출
		rc.setVolume(5);
	}
	
	// 3. 메소드 내에서 로컬 변수로 사용
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn(); // Audio의 turnOn()이 실행됨
		rc.setVolume(5); // Audio의 setVolume(5)이 실행됨
	}
	
	// 4. 메소드의 매개변수 타입으로 사용
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}


