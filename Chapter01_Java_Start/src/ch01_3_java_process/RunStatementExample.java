package ch01_3_java_process;

public class RunStatementExample {
	public static void main(String[] args) {
		System.out.println("Hello");
		method1();
//		int x = 1;
//		int y = 1;
//		int result = x + y;
//				   = 3
//		System.out.println(result);
//		System.out.println(reslt); ���縵Ʋ�����
//		�Ʒ� Problem ���� �������� �����ؼ� ���۸�!
		
		
		/* [�� ���� ���� ���]
		 * �� ���� ����
		 * �� ���� �� ����
		 * ���� ��� ����
		 * ����� ���� ���
		 */

		int x = 3;
		int y = 2;
		int z = x + y;
		System.out.println(z);
		
		
	}
	public static void method1() {
		System.out.println("Hello+++++");
	}
}
