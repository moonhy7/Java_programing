package reviewProblem;

public class MemberService {
	// 메소드
	boolean login(String id, String password) {
//		if(id == "hong" && password == "12345") { // 문자열 비교는 무조건 equals로 하기!!
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
