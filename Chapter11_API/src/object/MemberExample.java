package object;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) { // Ÿ�Ե� ���� �ʵ� ���� �����ؼ� true
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if(obj1.equals(obj3)) { // Ÿ���� ������ �ʵ� ���� �޶� false
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}
}
