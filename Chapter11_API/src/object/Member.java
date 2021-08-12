package object;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		//매개값이 Member 타입인지 확인
		if(obj instanceof Member) {
			Member member = (Member)obj;
			// id 필드값이 동일한지 검사
			if(id.equals(member.id)) {
				return true;
			}
		}
		// 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우
		return false;
	}
	
}
