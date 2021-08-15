package ch08_1_interface;

// 인터페이스 
interface RemoteControl {
	// 상수
		public static final int MAX_VALUE = 10;
		public static final int MIN_VALUE = 0;
		
		// 추상 메소드
		public abstract void turnOn();
		public abstract void turnOff();
		public abstract void setVolume(int volume);	
}

// 실체 클래스 Television
class Television implements RemoteControl {
	// 필드
	private int volume;
	
	// turnOn() 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	// turnOff() 메소드의 실체 메소드
	public  void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	// setVolume() 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE; // 최대값을 넘으면 값을 최대값으로 지정(최대값을 못넘도록 해줌)
		} else if(volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}

//실체 클래스 Audio
class Audio implements RemoteControl {
	// 필드
	private int volume; 
	
	// turnOn() 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	// turnOff() 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	// setVolume() 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if(volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
}

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}
}
