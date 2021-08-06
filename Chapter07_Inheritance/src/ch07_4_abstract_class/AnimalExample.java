package ch07_4_abstract_class;
//추상(규격) 클래스
abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
}
class Dog extends Animal { 
	public Dog() {
		this.kind = "포유류"
	}

}


public class AnimalExample {

}
