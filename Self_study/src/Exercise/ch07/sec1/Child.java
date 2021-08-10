package Exercise.ch07.sec1;

public class Child extends Parent{
	//필드
	private int studentNo; 
	
	//생성자
	public Child(String name, int studentNo) {
		super(name); // name 필드를 사용하려면 부모의 생성자를 super()를 통해 호출해야한다.
		this.name = name;
		this.studentNo = studentNo;
	}
}
