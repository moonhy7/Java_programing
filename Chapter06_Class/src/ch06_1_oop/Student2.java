package ch06_1_oop;

public class Student2 {
	int num = 0;
	
	//������
	Student2() {	
		num = 100;		
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.num); // 100
		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
		s1.setNum(1); 
		System.out.println(s1.getNum()); // 1

		
		Student s2 = new Student();
		System.out.println("s2 ������ �� �ٸ� Student ��ü�� �����մϴ�.");
		s2.setNum(2);
		System.out.println(s2.getNum()); //2
	}	
}

