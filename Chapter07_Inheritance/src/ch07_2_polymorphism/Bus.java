package ch07_2_polymorphism;

public class Bus extends Vehicle { // Vehicle Ŭ�����κ��� ��ӹ���
	@Override
	public void run() { // ���� Vehicle Ŭ������ �ִ� run() �޼ҵ带 �������̵���
		System.out.println("������ �޸��ϴ�.");
	}
}