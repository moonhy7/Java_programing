package ch07_3_abstract_class;

// �԰� Ŭ����
abstract class Phone {
	//�ʵ�
	public String owner;
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
 }
// �ڽ� Ŭ����
//class SmartPhone extends Phone {
//	
//}
//
//public class PhoneExample {
//	public static void main(String[] args) {
//		Phone p1 = new Phone();
//	}
//}
