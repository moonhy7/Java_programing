package ch07_3_abstract_class;

public class Dog extends Animal {
	// 생성자
	Dog() {
		this.kind = "포유류";
	}
	
	@Override	// 추상 메소드 재정의
	public void sound() {
		System.out.println("멍멍");
	}
}
