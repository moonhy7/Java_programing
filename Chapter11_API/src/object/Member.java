package object;

public class Member {
	// �ʵ�
	public String id; 

	// ������
	public Member(String id) {
		this.id = id;
	}

	// �޼ҵ�
	@Override
	public boolean equals(Object obj) {
		// �Ű� ���� Member Ÿ������
		if(obj instanceof Member) {
			// equals() �޼ҵ��� �Ű� ������ ���� obj�� Member Ÿ������ ���� ����ȯ ������
			Member member = (Member)obj;
			// Member ��ü�� member�� �ʵ� ���� id�� ���Ϸ��� �ʵ��� id�� ���� ���� �������� �� 
			if(id.equals(member.id)) { 
				return true;
			}
		} return false;
		// Ÿ�� ��ü�� �ٸ��ų� Ÿ���� ���� ������ �ʵ� ���� �ٸ� ��� false�� �������� 
	}
}
