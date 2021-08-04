package ch07_1_inheritance;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // <- 부모 생성자 호출
		this.studentNo = studentNo;
	}
}
