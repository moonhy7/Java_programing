package ch02_3_type_casting;

public class PromotionExample {

	public static void main(String[] args) {

/*	���� ����
 * 	Ÿ��(�ڷ���) ��ȯ
 * 	1. �ڵ�(�Ϲ���, ������) : �����Ϸ�...
 * 	2. ����(�����) :
 * 
 *	�⺻ ������ �Ȱ��� �����־����.
 *	���� �տ� ����Ʈ ������ϴ°ǵ� �����Ϸ��� �˾Ƽ�����
 * 	byte bv = 10;
 *	byte bv = (byte)10;
 *
 *	������ ū�׸��� �ִ°��� ����
 * 	int iv = bv; �����ϴ�.
 */
 
		
//		�� �������� ū Ÿ�� = ���� Ÿ��
		
//		�� �������� ū Ÿ��
//		"�� �ս�"
		
		
//		
//		
//		
		
//		������ ū�׸��� �ִ°��� ����
//		

		
		
		
		
		
//		byte(1) short(2) int(4) long(8)  float(4)  double(8)
//				char(2) 
//		(ū) = (����) �� ��� �����Ϸ��� �ڵ�����ȯ(������ �Ϲ���)�� �����ش�.
//		�� > int iv = bv; �ϸ� �ڵ�!
		
//		�ֳĸ� byte ���� Ŭ���� ū�� �ƴ϶�,, ~~�̱⶧����
//		������ long ���� float�� ����Ʈ���� �� �����鼭 ������ ����

//		1������ : short(2) �ִ밪 : , char(2) �ִ밪 : , ��� : ���� �� ū�� �� �� ����
//		2������ : float���� long�� �� ū�� ������,,,
		
//		byte�� �߿��Ѱ� �ƴ϶� ǥ�������� �߿��ϴٴ°� ���ϰ����
//		int iv = 9; 
		int iv   = 999999999; //������ �ִ�..
//		long lv = 9L;
		long lv  = 999999999_999999999L;
//		float fv = 9.0f;
		float fv = 9999999999999999999_9999999999999999999.0f;
		
		System.out.println((int)5.7);
		System.out.println((int)5.0);
		
		
//		"�� �ս�" �߻� ����

		
//		���� ����
		
		// �ڵ� Ÿ�� ��ȯ
		
		byte byteValue = 10;
		int intValue/*��*/ = byteValue;/*����*/ //������ int�� �ڵ����� ����ȯ�Ͼ
		System.out.println("intValue: " + intValue);
		
		char charValue = '��';
		intValue/*��*/ = charValue;/*����*/ // �ڵ�����ȯ
		System.out.println("���� �����ڵ�: " + intValue);
		
		intValue = 50; 
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue/*8*/ = 100;
		float/*4*/ floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		
		
		
	}

}
