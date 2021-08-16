package ch08_1_interface;

interface Searchable {
	// 추상 메소드
	void search(String Url);
}


class SmartTelevision implements RemoteControl, Searchable {
	// 필드
	private int volume;
	
	// 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
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
	public void search(String Url) {
		System.out.println(Url + "을 검색합니다.");
	}
}


public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision(); // 구현 객체 생성
		
		RemoteControl rm = tv; // 인터페이스 변수에 객체 대입
		Searchable searchable = tv;
	}
}
