package Exercise.ch07.sec1;

public class People {
	//필드
	public String name;
	public String ssn;
	
	//생성자 
	public People(String name, String ssn) { //기본 생성자가 아닌 명시적 생성자만 있음
		this.name = name; //super로 생성자 호출해야함
		this.ssn = ssn; 
	}
}
