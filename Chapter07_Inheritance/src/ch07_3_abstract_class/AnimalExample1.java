package ch07_3_abstract_class;
//추상(규격) 클래스
abstract class Animal1 {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// 추상 메소드(상속받는 자식 클래스에서의 오버라이딩을 강제화)
	public abstract void sound();
}

class Dog1 extends Animal1 { 
	public Dog1() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat1 extends Animal1 {
	public Cat1() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}

public class AnimalExample1 {
	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		Cat1 cat = new Cat1();
	}
}
