package ch07_3_abstract_class;
//�߻�(�԰�) Ŭ����
abstract class Animal1 {
	public String kind;
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	// �߻� �޼ҵ�(��ӹ޴� �ڽ� Ŭ���������� �������̵��� ����ȭ)
	public abstract void sound();
}

class Dog1 extends Animal1 { 
	public Dog1() {
		this.kind = "������";
	}
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
class Cat1 extends Animal1 {
	public Cat1() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�߿�");
	}
	
}

public class AnimalExample1 {
	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		Cat1 cat = new Cat1();
	}
}
