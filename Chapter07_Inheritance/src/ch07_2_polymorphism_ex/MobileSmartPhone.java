package ch07_2_polymorphism_ex;

class MobilePhone {
	//필드
	protected String number; // 전화번호
	//생성자
	public MobilePhone(String num) {
		number = num;
	}
	//메소드
	public void receive() {
		System.out.println("Hi~from " +this.number);
	}
}

class SmartPhone extends MobilePhone {
	//필드
	private String androidVer;
	//생성자
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	//메소드
	public void send(String number) {
		System.out.println("Hello~to " + number);
	}
	@Override
	public void receive() {
		super.receive();
		System.out.println("I am smart~ ");
	}
	
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
	
}

public class MobileSmartPhone {
	public static void main(String[] args) {

		//스마트폰 객체 생성
		SmartPhone phone = new SmartPhone("010-0000-1111", "Android 7.0");
		//전화걸기
		phone.send("010-8888-9999");
		//전화받기
		phone.receive();
		//앱을 선택하여 실행하기
		phone.playApp();
	}
}