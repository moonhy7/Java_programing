package reviewProblem;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		// 로그인 오류
		boolean result1 = memberService.login("hong", "54321"); // 비번 틀림
		execute(result1, memberService); // id 또는 password가 올바르지 않습니다.
		System.out.println();
		
		// 로그인 완료
		boolean result2 = memberService.login("hong", "12345");
		execute(result2, memberService); // 로그인 되었습니다.
	}
	
	static void execute(boolean result, MemberService memberService) {
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong"); // 로그아웃 되었습니다.
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
 