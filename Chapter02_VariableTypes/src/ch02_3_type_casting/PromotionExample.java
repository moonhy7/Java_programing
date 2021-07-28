package ch02_3_type_casting;

public class PromotionExample {

	public static void main(String[] args) {

/*	개념 정리
 * 	타입(자료형) 변환
 * 	1. 자동(암묵적, 묵시적) : 컴파일러...
 * 	2. 강제(명시적) :
 * 
 *	기본 전제는 똑같이 맞춰주어야함.
 *	원래 앞에 바이트 써줘야하는건데 컴파일러가 알아서해줌
 * 	byte bv = 10;
 *	byte bv = (byte)10;
 *
 *	작은걸 큰그릇에 넣는것은 가능
 * 	int iv = bv; 가능하다.
 */
 
		
//		값 허용범위가 큰 타입 = 작은 타입
		
//		값 허용범위가 큰 타입
//		"값 손실"
		
		
//		
//		
//		
		
//		작은걸 큰그릇에 넣는것은 가능
//		

		
		
		
		
		
//		byte(1) short(2) int(4) long(8)  float(4)  double(8)
//				char(2) 
//		(큰) = (작은) 인 경우 컴파일러가 자동형변환(묵시적 암묵적)을 시켜준다.
//		예 > int iv = bv; 하면 자동!
		
//		왜냐면 byte 수가 클수록 큰게 아니라,, ~~이기때문에
//		실제로 long 보다 float이 바이트수는 더 작으면서 서열이 높음

//		1문제점 : short(2) 최대값 : , char(2) 최대값 : , 결론 : 뭐가 더 큰지 알 수 없음
//		2문제점 : float보다 long이 더 큰건 맞지만,,,
		
//		byte가 중요한게 아니라 표현범위가 중요하다는걸 말하고싶음
//		int iv = 9; 
		int iv   = 999999999; //가능한 최대..
//		long lv = 9L;
		long lv  = 999999999_999999999L;
//		float fv = 9.0f;
		float fv = 9999999999999999999_9999999999999999999.0f;
		
		System.out.println((int)5.7);
		System.out.println((int)5.0);
		
		
//		"값 손실" 발생 여부

		
//		예제 시작
		
		// 자동 타입 변환
		
		byte byteValue = 10;
		int intValue/*형*/ = byteValue;/*동생*/ //동생을 int로 자동으로 형변환일어남
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue/*형*/ = charValue;/*동생*/ // 자동형변환
		System.out.println("가의 유니코드: " + intValue);
		
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
