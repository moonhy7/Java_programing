package Exercise.ch07.sec1;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-1234567", 1);
		System.out.println("name: " + student.name); // name: ȫ�浿
		System.out.println("ssn: " + student.ssn); // ssn: 123456-1234567
		System.out.println("studentNo: " + student.studentNo); // studentNo: 1
	}
}
