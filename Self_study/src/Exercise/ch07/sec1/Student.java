package Exercise.ch07.sec1;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // �θ� ������ ȣ���ϱ����� �Ű������� �ѱ�
//		this.name = name;
//		this.ssn = ssn; -> �̷��� �� �� ó�� ���� �Ǹ� ���� �߻�
		this.studentNo = studentNo ; // 
	}
}
