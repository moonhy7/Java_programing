package ch08_1_interface;

interface Searchable {
	// �߻� �޼ҵ�
	void search(String Url);
}


class SmartTelevision implements RemoteControl, Searchable {
	// �ʵ�
	private int volume;
	
	// ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if(volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}
	public void search(String Url) {
		System.out.println(Url + "�� �˻��մϴ�.");
	}
}


public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision(); // ���� ��ü ����
		
		RemoteControl rm = tv; // �������̽� ������ ��ü ����
		Searchable searchable = tv;
	}
}
