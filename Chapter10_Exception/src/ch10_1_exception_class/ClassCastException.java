package ch10_1_exception_class;

// �θ� Ŭ������ �ڽ� Ŭ���� ����
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastException {
	public static void main(String[] args) {
		Dog dog = new Dog(); // Dog Ÿ�� ��ü dog ����
		changeDog(dog); // �� �����

		Cat cat = new Cat();
		changeDog(cat); 
		// changeDog() �޼ҵ忡 �Ű������� cat ������ �ָ� Dog Ÿ������ ��ȯ�� �� ��� ���ܰ� �߻���
	}

	private static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal; 
		} else {
			System.out.println("Ÿ�� ��ȯ ����");
		}
	}
}




