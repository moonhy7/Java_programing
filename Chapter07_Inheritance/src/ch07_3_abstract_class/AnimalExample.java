package ch07_3_abstract_class;
//�߻�(�԰�) Ŭ����
abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	// �߻� �޼ҵ�(��ӹ޴� �ڽ� Ŭ���������� �������̵��� ����ȭ)
	public abstract void sound();
}

class Dog extends Animal { 
	public Dog() {
		this.kind = "������";
	}
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�߿�");
	}
	
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
	}
}
