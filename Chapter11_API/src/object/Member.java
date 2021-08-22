package object;

public class Member {
	// 필드
	public String id; 

	// 생성자
	public Member(String id) {
		this.id = id;
	}

	// 메소드
	@Override
	public boolean equals(Object obj) {
		// 매개 값이 Member 타입으로
		if(obj instanceof Member) {
			// equals() 메소드의 매개 값으로 들어온 obj를 Member 타입으로 강제 형변환 시켜줌
			Member member = (Member)obj;
			// Member 객체인 member의 필드 값인 id와 비교하려는 필드인 id가 값이 서로 동등한지 비교 
			if(id.equals(member.id)) { 
				return true;
			}
		} return false;
		// 타입 자체가 다르거나 타입은 서로 같지만 필드 값이 다른 경우 false를 리턴해줌 
	}
}
