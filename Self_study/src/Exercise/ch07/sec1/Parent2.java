package Exercise.ch07.sec1;

public class Parent2 {
	// 필드
	public String nation;
	
	// 생성자
	public Parent2() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	//생성자
	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
