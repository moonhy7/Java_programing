package Exercise.ch06;

public class ClassName {
	
	// �ν��Ͻ� ��� ����
	int field1;
	void method1() {};
	
	// ���� ��� ����
	static int field2;
	static void method2() {};
	
	// ���� �޼ҵ� �ȿ��� �ʵ�� �޼ҵ� ���
	static void method3() {
//		this.field1 = 10; //�ν��Ͻ� �ʵ带 this �����ڷ� ���ٽ� �����Ͽ���
//		this.method1(); //�ν��Ͻ� �޼ҵ带 this �����ڷ� ���ٽ� �����Ͽ���
		field2 = 10; //���� �ʵ�� �׳� ����� �� ����
		method2(); //���� �޼ҵ嵵 �׳� ����� �� ����
		
		ClassName obj = new ClassName(); // �ν��Ͻ� ��� ����� ���� ���� ��ü�� ����
		obj.field1 = 10; // �ν��Ͻ� �ʵ带 ����ϱ� ���� ���� ������ ����
		obj.method1(); // �ν��Ͻ� �޼ҵ带 ����ϱ� ���� ���� ������ ����
	}
}
