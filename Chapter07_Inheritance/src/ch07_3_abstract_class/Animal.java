package ch07_3_abstract_class;

public abstract class Animal { // �߻� Ŭ����
	// �ʵ�
	public String kind;
	
	// �޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound(); // �߻� �޼ҵ�
	
}