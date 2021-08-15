package ch07_2_polymorphism_ex;

// 부모 클래스
class MobilePhone {
	// 필드
	protected String number;
	
	// 생성자
	public MobilePhone(String num) {
		this.number = num;
	}
	
	// 메소드
	public void receive() {
		System.out.println("Hi~from " + this.number);
	}	
}

// 자식 클래스
class SmartPhone extends MobilePhone {
	// 필드
	private String androidVer;
	
	// 생성자
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	
	// 메소드
	public void send(String number) {
		System.out.println("Hello~to " + number);
	}
	
	public void playApp() {
		System.out.println("App is runnung in " + androidVer);
	}
	
	@Override
	public void receive() {
		super.receive();
		System.out.println("I am smart");
	}
}

// 실행 클래스
public class MobileSmartPhone {
	public static void main(String[] args) {
		
		// 스마트폰 객체 생성
		SmartPhone phone1 = new SmartPhone("010-2","Ios 7.0");
		MobilePhone phone2 = new SmartPhone("010-3","Ios 14.7.1");
		
		//전화걸기
		phone1.send("010-1"); // Hello~to 010-1 -> 자식 클래스의 메소드 호출
		// phone2.send("010-1"); // 컴파일 에러
		// 부모 타입으로 자동 타입 변환된 참조 변수인 phone2로 자식 클래스 소속 메소드(send())를 호출할 수 없다.
		
		//전화받기
		phone1.receive(); // Hi~from 010-2 I am smart -> 자식 클래스 메소드가 호출됨
		phone2.receive(); // Hi~from 010-3 I am smart 
		// -> 부모 타입으로 자동 타입 변환된거지만 receive() 메소드는 애초에 부모 클래스에도 있어서 호출이 되는 것임
		// 그런데 자식 클래스에서 메소드 재정의를 했기 때문에 재정의된 메소드가 호출되는 것이다.
		
		//앱을 선택하여 실행하기
		phone1.playApp(); // App is runnung in Ios 7.0
		// phone2.playApp(); // 컴파일 에러
		// // 부모 타입으로 자동 타입 변환된 참조 변수인 phone2로 자식 클래스 소속 메소드(playApp())를 호출할 수 없다.
	}
}
