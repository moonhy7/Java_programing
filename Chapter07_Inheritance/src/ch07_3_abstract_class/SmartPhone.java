package ch07_3_abstract_class;

public class SmartPhone extends Phone{
	// ������
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// �޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}
