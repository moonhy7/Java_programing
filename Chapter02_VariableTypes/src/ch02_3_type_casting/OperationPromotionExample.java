package ch02_3_type_casting;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue 3 = byteValue1 + byteValue2; //������ ����
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�=" + intValue2);
		System.out.println("��¹���=" + (char)intValue2);
		
		int intValue = 10;
//		int intValue4 = intValue3/4;
//		System.out.println(intValue4);
	}
}
