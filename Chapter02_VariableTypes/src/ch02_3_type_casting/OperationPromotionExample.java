package ch02_3_type_casting;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue 3 = byteValue1 + byteValue2; //컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1); //30
		
		char charValue1 = 'A';
		char charValue2 = 1;
		System.out.println(charValue1); //A
		System.out.println(charValue2); // ?
//		char charValue3 = charValue1 + charValue2; // 컴파일 에러
		int intValue2 = charValue1 + charValue2; 
		System.out.println("유니코드=" + intValue2); // 66 
		System.out.println("출력문자=" + (char)intValue2); //B
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4); //2
		
		int intValue5 = 10;
//		int intValue6 = intValue5/4.0; // 컴파일 에러
		double doubleValue = intValue5 / 4.0; // 2.5
		
		int x = 1, y = 2;
		double result = (double) x / y; // 0.5
		
		double result1 = 1.5 + 2.3; // 3.8
//		float result2 = 1.5 + 2.3; // 컴파일 에러
		float result3 = 1.5f + 2.3f; //3.8
		System.out.println(result);
		
		
		
		
	}
}
