package ch07_3_abstract_class;
//추상(규격) 클래스
abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// 추상 메소드(상속받는 자식 클래스에서의 오버라이딩을 강제화)
	public abstract void sound();
}

class Dog extends Animal { 
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
	}
}
