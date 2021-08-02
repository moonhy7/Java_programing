package ch02_4_console_in_out;

import java.io.IOException;

public class SystemInOut {
	public static void main(String[] args) throws IOException {
//		[KeyCodeExample.java]
				
//		int keyCode; // 2번째 개념 : 한번만 사용할 경우 변수를 굳이 선언해주지않고 print문 안에서 해도됨 
//		keyCode = System.in.read(); 에러발생
		
		try {
			System.out.printf("keCode: %d\n",System.in.read());
			System.out.printf("keCode: %d\n",System.in.read());
			System.out.printf("keCode: %d\n",System.in.read());
			System.out.printf("keCode: %d\n",System.in.read());
			System.out.printf("keCode: %d\n",System.in.read());
//												int형 숫자
//			keyCode = System.in.read(); //
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
// System.in.read();에 빨간줄 생기며 에러 발생
//에러내용 : unhandled exception type IOEwception
//에러 의미 : 
//Add throws declaration 클릭해줄것
// 	public static void main(String[] args) throws IOException {
//로 바뀌는것 (사실 예외를 던져버리는건 올바른 방법이 아니다,예외를 처리해주어야함)

// 
// abc : 97(아~a만읽어주는거나~) <---printf가 한 줄 일때
//abc
//keCode: 97
//keCode: 98
//keCode: 99
//keCode: 13
//keCode: 10 (3개 다 읽어줌) <---printf가 다섯 줄 일때

// 결론 : printf 문장 개수 만큼만 읽어준다
// 난 abcd...xyz 를 다 읽고싶은데,, 너무 불편하다!!
// 내가 몇개를 입력하던 다 찍고싶을때 해결법!!

// 1. while 이것도 불편
// 2. scanner


