package ch09_1_inner;

public class A2 {
	
	//�ν��Ͻ� �ʵ�� �޼ҵ�
	int field1;
	void method1() {}
	
	//���� �ʵ�� �޼ҵ�
	static int field2;
	static void method2() {}
	
	
	class B2 {	// �ν��Ͻ� ��� Ŭ������ ��� �ʵ�� �޼ҵ忡 ���� �����ϴ�
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;	
			method2();
		}
	}
	
	static class C {	// ���� ��� Ŭ������ ���� �ʵ�� �޼ҵ常 ������ �����ϴ�.
		void method() { 
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
