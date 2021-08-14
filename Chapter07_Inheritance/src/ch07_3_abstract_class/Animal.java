package ch07_3_abstract_class;

public abstract class Animal { // 추상 클래스
	// 필드
	public String kind;
	
	// 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상 메소드
	
}
