package ch08_1_interface;

interface Searchable {
	// 추상 메소드
	public abstract void search(String Url);
}

class SmartTelevision implements RemoteControl, Searchable {
	// 필드
	private int volume;
	private String name;
	
	// 생성자
	public SmartTelevision(String name) {
		this.name = name;
	}
	
	// 실체 메소드
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if(volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}


public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision("SAMSUNG smart TV"); // 구현 객체 생성
		// 자동 형변환 (RemoteControl <- SmartTelevision)
		// RemoteControl 기능만 사용 가능
		RemoteControl rc = stv; // 인터페이스 변수에 객체 대입
		rc.turnOn();
		
		//자동 형변환 (Searchable <- SmartTelevision)
		// Searchable 기능만 사용 가능
		Searchable sc = stv;
		sc.search("www.google.com");
		// sc.turnOn(); 사용 못함
	}
}
