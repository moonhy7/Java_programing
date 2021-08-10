package Exercise.ch07.sec1;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자 호출하기위해 매개값으로 넘김
//		this.name = name;
//		this.ssn = ssn; -> 이렇게 두 줄 처럼 쓰게 되면 에러 발생
		this.studentNo = studentNo ; // 
	}
}
