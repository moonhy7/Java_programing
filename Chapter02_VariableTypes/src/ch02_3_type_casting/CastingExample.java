package ch02_3_type_casting;

public class CastingExample {
	public static void main(String[] args) {
//			����(�����)����ȯ
//	:~�ؼ��ϴ� ����� ��ȯ...
//		���ս��� ���� �Ͼ�� �ȵ�
//		���� ��Ʈ�� ū �� ��� ������ ������ �ϰڴٴ°� �ٷ� ��������ȯ��
		
		System.out.println((char)65);
//		Ȯ��(Promotion) : int -----> double �ս�(x) �ڵ�
//		���(Demotion)  : double -----> int thstlf(o) ����.. 0.5 --> 0
		
		int iv = 127;
		iv = 1000000; // ���� �� ���Ҵ�
		
//		byte bv = iv;
		byte bv = (byte)iv;
		System.out.println(bv);
		
//		(char) <------  int....long...
		double dv = 3.14;
		iv = (int)dv;
		
		System.out.println(iv);
		
		// "781001-1111111"
//		int number = (int)"7810011111111";
		System.out.println("781001-1111111");
		
		
//		<���� ����>
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
	}
}
