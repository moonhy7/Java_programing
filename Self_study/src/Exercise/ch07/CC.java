package Exercise.ch07;

import Exercise.ch06.AA;

public class CC {
	public CC() {
		AA a = new AA();
		a.field1 = 1;
//		a.field2 = 1; // default �ʵ� ���� �Ұ�
//		a.field3 = 1; // private �ʵ� ���� �Ұ�
		
		a.method1();
//		a.method2(); // default �ʵ� ���� �Ұ�
//		a.method3(); // private �ʵ� ���� �Ұ�
	}
}


