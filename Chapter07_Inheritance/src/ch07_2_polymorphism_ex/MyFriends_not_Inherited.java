package ch07_2_polymorphism_ex;

// 대학 친구
class UnivFriend1 {
	// 필드
	private String name;
	private String major;
	private String phone;

	// 생성자
	public UnivFriend1(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}

	// 메소드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
		System.out.println("전화번호 : " + phone);
	}
}

// 직장 동료
class CompFriend1 {
	// 필드
	private String name;
	private String department;
	private String phone;

	// 생성자
	public CompFriend1 (String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}

	// 메소드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
		System.out.println("전화번호 : " + phone);
	}
}

// 실행 클래스
public class MyFriends_not_Inherited {
	public static void main(String[] args) {
		// 대학 친구의 관리를 위한 배열과 변수
		UnivFriend[] uf = new UnivFriend[3];
		int uc = 0;

		// 직장 동료의 관리를 위한 배열과 변수
		CompFriend[] cf = new CompFriend[3];
		int cc = 0;

		// 대학친구 추가
		uf[uc++] = new UnivFriend("kim", "computer", "010-1");
		uf[uc++] = new UnivFriend("lee", "electronics", "010-2");
		uf[uc++] = new UnivFriend("seo", "Math", "010-3");

		// 직장동료 추가
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



