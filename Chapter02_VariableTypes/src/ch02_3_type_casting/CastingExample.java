package ch02_3_type_casting;

public class CastingExample {
	public static void main(String[] args) {
//			강제(명시적)형변환
//	:~해석하는 방법을 변환...
//		값손실은 절대 일어나면 안됨
//		작은 비트에 큰 걸 담는 행위를 강제로 하겠다는게 바로 강제형변환임
		
		System.out.println((char)65);
//		확장(Promotion) : int -----> double 손실(x) 자동
//		축소(Demotion)  : double -----> int thstlf(o) 강제.. 0.5 --> 0
		
		int iv = 127;
		iv = 1000000; // 변수 값 재할당
		
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
		
		
//		<예제 시작>
		
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
