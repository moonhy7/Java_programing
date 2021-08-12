package object;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		//�Ű����� Member Ÿ������ Ȯ��
		if(obj instanceof Member) {
			Member member = (Member)obj;
			// id �ʵ尪�� �������� �˻�
			if(id.equals(member.id)) {
				return true;
			}
		}
		// �Ű����� Member Ÿ���� �ƴϰų� id �ʵ尪�� �ٸ� ���
		return false;
	}
	
}
