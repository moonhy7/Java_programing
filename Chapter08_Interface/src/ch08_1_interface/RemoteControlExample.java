package ch08_1_interface;

// �������̽� 
interface RemoteControl {
	// ���
		public static final int MAX_VALUE = 10;
		public static final int MIN_VALUE = 0;
		
		// �߻� �޼ҵ�
		public abstract void turnOn();
		public abstract void turnOff();
		public abstract void setVolume(int volume);	
}

// ��ü Ŭ���� Television
class Television implements RemoteControl {
	// �ʵ�
	private int volume;
	
	// turnOn() �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	// turnOff() �޼ҵ��� ��ü �޼ҵ�
	public  void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	// setVolume() �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE; // �ִ밪�� ������ ���� �ִ밪���� ����(�ִ밪�� ���ѵ��� ����)
		} else if(volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}
}

//��ü Ŭ���� Audio
class Audio implements RemoteControl {
	// �ʵ�
	private int volume; 
	
	// turnOn() �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	// turnOff() �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	// setVolume() �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if(volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume);
	}
}

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}
}
