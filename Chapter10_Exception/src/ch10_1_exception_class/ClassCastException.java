package ch10_1_exception_class;

// 부모 클래스와 자식 클래스 생성
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastException {
	public static void main(String[] args) {
		Dog dog = new Dog(); // Dog 타입 객체 dog 생성
		changeDog(dog); // 잘 실행됨

		Cat cat = new Cat();
		changeDog(cat); 
		// changeDog() 메소드에 매개값으로 cat 변수를 주면 Dog 타입으로 변환할 수 없어서 예외가 발생함
	}

	private static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal; 
		} else {
			System.out.println("타입 변환 실패");
		}
	}
}




