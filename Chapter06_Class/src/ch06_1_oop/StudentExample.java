package ch06_1_oop;

public class StudentExample {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.num);

		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
		s1.setNum(1);
		
		Student s2 = new Student();
		System.out.println("s2 ������ �� �ٸ� Student ��ü�� �����մϴ�.");
		s2.setNum(2);
		
		System.out.println(s1.getNum());
		System.out.println(s2.getNum());
	}
}
