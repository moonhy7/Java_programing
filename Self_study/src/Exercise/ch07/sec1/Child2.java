package Exercise.ch07.sec1;

public class Child2 extends Parent2 {
	//필드
	private String name;
	
	//생성자
	public Child2() {
		this("홍길동");
		System.out.println("Child() call");
	}
	//생성자
	public Child2(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}