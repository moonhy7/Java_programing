package ch07_2_polymorphism_ex;

// �θ� Ŭ����
class Friend {
	// �ʵ�
	public String name;
	public String phone;

	// ������
	public Friend(String na, String ph) {
		name = na;
		phone =ph;
	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phone);
	}

}

// �ڽ� Ŭ���� - ���� ģ��
class UnivFriend extends Friend {
	// �ʵ�
	public String major;
	
	// ������
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major =ma;
	}
	
	// �޼ҵ�
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : major");
	}
}

// �ڽ� Ŭ���� - ���� ����
class CompFriend extends Friend{
	// �ʵ�
	public String department;
	
	// ������
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	
	// �޼ҵ�
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("�μ� : " + department);
	}
}

// ���� Ŭ����
public class MyFriends {
	public static void main(String[] args) {
		Friend[] friends = new Friend[6];
		int count=0;
		
		// ����ģ�� �߰�
		friends[count++] = new UnivFriend("kim", "computer", "010-1");
		friends[count++] = new UnivFriend("lee", "electronics", "010-2");
		friends[count++] = new UnivFriend("seo", "Math", "010-3");
		
		// ���嵿�� �߰�
		friends[count++] = new CompFriend("kim", "R&D", "010-1");
		friends[count++] = new CompFriend("lee", "R&D", "010-2");
		friends[count++] = new CompFriend("seo", "R&D", "010-3");
		
		for(int i=0; i<friends.length; i++) {
			friends[i].showInfo();
			if(friends[i].name == "kim") {
				System.out.println("kim ��" + i+1 + "��°���� ã�ҽ��ϴ�.");
			} System.out.println();
		}
	}
}



