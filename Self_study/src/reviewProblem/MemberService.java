package reviewProblem;

public class MemberService {
	// �޼ҵ�
	boolean login(String id, String password) {
//		if(id == "hong" && password == "12345") { // ���ڿ� �񱳴� ������ equals�� �ϱ�!!
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
