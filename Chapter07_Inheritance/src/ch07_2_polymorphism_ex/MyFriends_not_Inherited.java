package ch07_2_polymorphism_ex;

// ���� ģ��
class UnivFriend1 {
	// �ʵ�
	private String name;
	private String major;
	private String phone;

	// ������
	public UnivFriend1(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + major);
		System.out.println("��ȭ��ȣ : " + phone);
	}
}

// ���� ����
class CompFriend1 {
	// �ʵ�
	private String name;
	private String department;
	private String phone;

	// ������
	public CompFriend1 (String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("�μ� : " + department);
		System.out.println("��ȭ��ȣ : " + phone);
	}
}

// ���� Ŭ����
public class MyFriends_not_Inherited {
	public static void main(String[] args) {
		// ���� ģ���� ������ ���� �迭�� ����
		UnivFriend[] uf = new UnivFriend[3];
		int uc = 0;

		// ���� ������ ������ ���� �迭�� ����
		CompFriend[] cf = new CompFriend[3];
		int cc = 0;

		// ����ģ�� �߰�
		uf[uc++] = new UnivFriend("kim", "computer", "010-1");
		uf[uc++] = new UnivFriend("lee", "electronics", "010-2");
		uf[uc++] = new UnivFriend("seo", "Math", "010-3");

		// ���嵿�� �߰�
		cf[cc++] = new CompFriend("kim", "R&D", "010-1");
		cf[cc++] = new CompFriend("lee", "R&D", "010-2");
		cf[cc++] = new CompFriend("seo", "R&D", "010-3");

		for(int i=0; i<uf.length; i++) {
			uf[i].showInfo();
			System.out.println();
		}

		for(int i=0; i<cf.length; i++) {
			cf[i].showInfo();
			System.out.println();
		}
	}
}



