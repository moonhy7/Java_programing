package Exercise.ch06;

public class BB {
	// ������
	public BB() {
		AA a = new AA();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // private �ʵ� ���� �Ұ�
		
		a.method1();
		a.method2();
//		a.method3(); // private �޼ҵ� ���� �Ұ�
	}
}


