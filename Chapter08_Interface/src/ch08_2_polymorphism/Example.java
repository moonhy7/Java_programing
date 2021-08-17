package ch08_2_polymorphism;

// ���� �������̽� 2�� 
interface InterfaceA {
	public void methodA();
 }

interface InterfaceB {
	public void methodB();
}

//���� �������̽�
interface InterfaceC extends InterfaceA, InterfaceB {
	public void methodC();
}

// ���� �������̽� ����
class ImplementationC implements InterfaceC {
	public void methodA() { // InterfaceC�� �� ���� �ִ� ��� ���� �������̽����� ��ü �޼ҵ�鵵 �־����
		System.out.println("ImplementationC-methodA() ����");
	}
	
	public void methodB() {
			System.out.println("ImplementationC-methodB() ����");
		}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
	}
}

// ���� Ŭ����
public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC(); 
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println(); // methodA()�� ȣ�� ����
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println(); // methodB()�� ȣ�� ����
		
		InterfaceC ic = impl;
		ic.methodA();	// InterfaceC ������  �� �޼ҵ� ��� ȣ�� ����
		ic.methodB();
		ic.methodC();	
	}
}
