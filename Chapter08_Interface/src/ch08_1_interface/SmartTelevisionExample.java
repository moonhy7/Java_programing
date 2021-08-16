package ch08_1_interface;

interface Searchable {
	// �߻� �޼ҵ�
	public abstract void search(String Url);
}

class SmartTelevision implements RemoteControl, Searchable {
	// �ʵ�
	private int volume;
	private String name;
	
	// ������
	public SmartTelevision(String name) {
		this.name = name;
	}
	
	// ��ü �޼ҵ�
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("���� TV ���� : " + this.volume);
	}
}


public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision("SAMSUNG smart TV"); // ���� ��ü ����
		// �ڵ� ����ȯ (RemoteControl <- SmartTelevision)
		// RemoteControl ��ɸ� ��� ����
		RemoteControl rc = stv; // �������̽� ������ ��ü ����
		rc.turnOn();
		
		//�ڵ� ����ȯ (Searchable <- SmartTelevision)
		// Searchable ��ɸ� ��� ����
		Searchable sc = stv;
		sc.search("www.google.com");
		// sc.turnOn(); ��� ����
	}
}
