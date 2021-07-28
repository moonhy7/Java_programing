package ch02_2_primitive;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A'; // 문자를 직접 저장
		char c2 = 65; // 65번째 아스키코드 = A
		char c3 = '\u0041'; // 4 * 16 + 1 = 65
		
		char c4 = '가'; // 문자를 직접 저장.
		char c5 = 44032; // 44032번째 아스키코드 = 가
		char c6 = '\uac00'; // 10*16^3 +12*16^2 = 44032
		
		System.out.println(c1); // A
		System.out.println(c2); // A
		System.out.println(c3); // A
		System.out.println(c4); // 가
		System.out.println(c5); // 가
		System.out.println(c6); // 가

		
//		char 타입 : 문자 , ' ' 
//		String 타입 : 문자열 , " "
		
//		char var1 = "A"; // 에러 발생
//		char var2 = "홍길동"; // 에러 발생
		
		String var1 = "A";
		String var2 = "홍길동";
		
		System.out.println(var1);
		System.out.println(var2);
		
	}

}
