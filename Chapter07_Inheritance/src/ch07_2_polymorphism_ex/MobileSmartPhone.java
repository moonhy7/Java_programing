package ch07_2_polymorphism_ex;

class MobilePhone {
	//�ʵ�
	protected String number; // ��ȭ��ȣ
	//������
	public MobilePhone(String num) {
		number = num;
	}
	//�޼ҵ�
	public void receive() {
		System.out.println("Hi~from " +this.number);
	}
}

class SmartPhone extends MobilePhone {
	//�ʵ�
	private String androidVer;
	//������
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	//�޼ҵ�
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

		//����Ʈ�� ��ü ����
		SmartPhone phone = new SmartPhone("010-0000-1111", "Android 7.0");
		//��ȭ�ɱ�
		phone.send("010-8888-9999");
		//��ȭ�ޱ�
		phone.receive();
		//���� �����Ͽ� �����ϱ�
		phone.playApp();
	}
}