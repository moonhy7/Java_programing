package ch07_3_abstract_class;

public class Cat extends Animal{
	// ������
	public Cat() {
		this.kind = "������";
	}
	
	@Override // �߻� �޼ҵ� ������
	public void sound() {
		System.out.println("�߿�");
	}
}
