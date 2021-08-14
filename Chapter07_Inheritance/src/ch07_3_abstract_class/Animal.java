package ch07_3_abstract_class;

public abstract class Animal { // 추상(규격) 클래스
	// 필드
	public String kind;
	
	// 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드(상속받는 자식 클래스에서의 오버라이딩을 강제화)
	public abstract void sound();
}
