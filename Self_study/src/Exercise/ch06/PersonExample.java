package Exercise.ch06;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "ȫ�浿");
		System.out.println("nation: " + p1.nation);
		System.out.println("ssn: " + p1.ssn);
		System.out.println("name: " + p1.name);
		
//		p1.nation = "usa"; // final �ʵ� �� ���� �� ���� �߻�
//		p1.ssn = "654321-7654321"; // final �ʵ� �� ���� �� ���� �߻�
		p1.name = "ȫ�浿";
	}
}
