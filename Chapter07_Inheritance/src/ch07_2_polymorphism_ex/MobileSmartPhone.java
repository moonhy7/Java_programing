package ch07_2_polymorphism_ex;

// �θ� Ŭ����
class MobilePhone {
	// �ʵ�
	protected String number;
	
	// ������
	public MobilePhone(String num) {
		this.number = num;
	}
	
	// �޼ҵ�
	public void receive() {
		System.out.println("Hi~from " + this.number);
	}	
}

// �ڽ� Ŭ����
class SmartPhone extends MobilePhone {
	// �ʵ�
	private String androidVer;
	
	// ������
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	
	// �޼ҵ�
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

// ���� Ŭ����
public class MobileSmartPhone {
	public static void main(String[] args) {
		
		// ����Ʈ�� ��ü ����
		SmartPhone phone1 = new SmartPhone("010-2","Ios 7.0");
		MobilePhone phone2 = new SmartPhone("010-3","Ios 14.7.1");
		
		//��ȭ�ɱ�
		phone1.send("010-1"); // Hello~to 010-1 -> �ڽ� Ŭ������ �޼ҵ� ȣ��
		// phone2.send("010-1"); // ������ ����
		// �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���� ������ phone2�� �ڽ� Ŭ���� �Ҽ� �޼ҵ�(send())�� ȣ���� �� ����.
		
		//��ȭ�ޱ�
		phone1.receive(); // Hi~from 010-2 I am smart -> �ڽ� Ŭ���� �޼ҵ尡 ȣ���
		phone2.receive(); // Hi~from 010-3 I am smart 
		// -> �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�Ȱ����� receive() �޼ҵ�� ���ʿ� �θ� Ŭ�������� �־ ȣ���� �Ǵ� ����
		// �׷��� �ڽ� Ŭ�������� �޼ҵ� �����Ǹ� �߱� ������ �����ǵ� �޼ҵ尡 ȣ��Ǵ� ���̴�.
		
		//���� �����Ͽ� �����ϱ�
		phone1.playApp(); // App is runnung in Ios 7.0
		// phone2.playApp(); // ������ ����
		// // �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���� ������ phone2�� �ڽ� Ŭ���� �Ҽ� �޼ҵ�(playApp())�� ȣ���� �� ����.
	}
}
