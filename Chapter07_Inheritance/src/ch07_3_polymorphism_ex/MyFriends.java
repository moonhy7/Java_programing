package ch07_3_polymorphism_ex;

// 대학친구
class UnivFriend {
	//필드
	private String name;
	private String major;
	private String phone;
	
	//생성자
	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}
	//메소드
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("전화: " + phone);
	}
}

// 직장동료
class CompFriend {
	//필드
	private String name;
	private String department;
	private String phone;
	
	//생성자
	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}
	
	//메소드
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + department);
		System.out.println("전화: " + phone);
	}
}

public class MyFriends {
	public static void main(String[] args) {
		
		//대학 친구의 관리를 위한 배열과 변수
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt = 0;
		
		//직장 동료의 관리를 위한 배열과 변수
		CompFriend[] cfns = new CompFriend[5];
		int ccnt = 0;
		
		//대학친구 추가
//		ufrns[unct++] = new UnivFriend("LEE, ma, ph");
		
	}
}
