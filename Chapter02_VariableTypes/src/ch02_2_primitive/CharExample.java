package ch02_2_primitive;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A'; // ���ڸ� ���� ����
		char c2 = 65; // 65��° �ƽ�Ű�ڵ� = A
		char c3 = '\u0041'; // 4 * 16 + 1 = 65
		
		char c4 = '��'; // ���ڸ� ���� ����.
		char c5 = 44032; // 44032��° �ƽ�Ű�ڵ� = ��
		char c6 = '\uac00'; // 10*16^3 +12*16^2 = 44032
		
		System.out.println(c1); // A
		System.out.println(c2); // A
		System.out.println(c3); // A
		System.out.println(c4); // ��
		System.out.println(c5); // ��
		System.out.println(c6); // ��

		
//		char Ÿ�� : ���� , ' ' 
//		String Ÿ�� : ���ڿ� , " "
		
//		char var1 = "A"; // ���� �߻�
//		char var2 = "ȫ�浿"; // ���� �߻�
		
		String var1 = "A";
		String var2 = "ȫ�浿";
		
		System.out.println(var1);
		System.out.println(var2);
		
	}

}
