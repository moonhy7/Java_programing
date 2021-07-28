package ch02_3_type_casting;

public class ByteOperationExample {
	public static void main(String[] args) {
		
		// [정수 연산에서의 자동타입변환]
		
/*
		byte x = 10, y = 20;
		byte result = 10 + 20; //?
		byte result = x + y; 에러
				  	 int  int
//		byte result = (byte)x + y; 에러
//		byte + int = 에러 ?
		
//		byte result = (byte)(x + y); 에러안남
		System.out.println(result);
		
		
		// int끼리 계산 (자바는 int가 기본)을 먼저 하고 byte로 변형 
	    // 컴파일러는 일단 연산부터 해야됨
		// 우선 x=10, y=20 으로 세팅되어있음

		
*/
		
		
		
//		[한번더 연습]
//		byte x = 100, y = 29;
//		byte result = (byte)(x + y);
//		System.out.println(result);
		
		
		
		
//		예제 시작
		
		byte result1 = 10 + 20;
		System.out.println(result1);

		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
		
		
	}
}
