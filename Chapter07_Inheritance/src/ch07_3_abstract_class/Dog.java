package ch07_3_abstract_class;

public class Dog extends Animal {
	// ������
	Dog() {
		this.kind = "������";
	}
	
	@Override	// �߻� �޼ҵ� ������
	public void sound() {
		System.out.println("�۸�");
	}
}
