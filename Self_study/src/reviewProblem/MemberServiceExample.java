package reviewProblem;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		// �α��� ����
		boolean result1 = memberService.login("hong", "54321"); // ��� Ʋ��
		execute(result1, memberService); // id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.
		System.out.println();
		
		// �α��� �Ϸ�
		boolean result2 = memberService.login("hong", "12345");
		execute(result2, memberService); // �α��� �Ǿ����ϴ�.
	}
	
	static void execute(boolean result, MemberService memberService) {
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong"); // �α׾ƿ� �Ǿ����ϴ�.
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
 