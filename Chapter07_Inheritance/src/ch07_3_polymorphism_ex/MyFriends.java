package ch07_3_polymorphism_ex;

// ����ģ��
class UnivFriend {
	//�ʵ�
	private String name;
	private String major;
	private String phone;
	
	//������
	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}
	//�޼ҵ�
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + major);
		System.out.println("��ȭ: " + phone);
	}
}

// ���嵿��
class CompFriend {
	//�ʵ�
	private String name;
	private String department;
	private String phone;
	
	//������
	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}
	
	//�޼ҵ�
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("�μ�: " + department);
		System.out.println("��ȭ: " + phone);
	}
}

public class MyFriends {
	public static void main(String[] args) {
		
		//���� ģ���� ������ ���� �迭�� ����
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt = 0;
		
		//���� ������ ������ ���� �迭�� ����
		CompFriend[] cfns = new CompFriend[5];
		int ccnt = 0;
		
		//����ģ�� �߰�
//		ufrns[unct++] = new UnivFriend("LEE, ma, ph");
		
	}
}
