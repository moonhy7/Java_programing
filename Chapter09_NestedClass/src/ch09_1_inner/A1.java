package ch09_1_inner;

public class A1 {
	
	//�ν��Ͻ� �ʵ�
	B1 field1 = new B1();
	C1 field2 = new C1();
	
	// �ν��Ͻ� �޼ҵ�
	void method1() {
		B1 var1 = new B1();
		C1 var2 = new C1();
	}
	
	// ���� �ʵ� �ʱ�ȭ
	// static B1 field3 = new B1();
	static C1 field4 = new C1();
	
	// ���� �޼ҵ�
	static void method2() {
		//B1 var1 = new B1();
		C1 var2 = new C1();
	}
	
	// �ν��Ͻ� ��� Ŭ���� 
	// �ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ� ��ο��� ��ü ���� ����
	// �׷��� ���� �ʵ�� ���� �޼ҵ忡���� B ��ü ���� �Ұ� 
	class B1 {}
	
	// ���� ��� Ŭ���� 
	// ��𼭵� ��ü ���� ����
	static class C1 {}
}
