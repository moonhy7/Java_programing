package ch02_4_console_in_out;

import java.io.IOException;

public class ContinueKeyCodeReadExample {
	public static void main(String[] args) throws IOException {
		// 예외를 안에서 처리하는게 아니라 그냥 던져버릴게~ 하는거임
		// 이거안쓰면 에러안사라짐
		int keyCode;

		//반복문 (for....횟수, while 조건)
		while(true) {
			keyCode = System.in.read();
			// 에러 날때 해결법!! 빨간줄 위에 커서 대면 add~누르면 됨!!
			if(keyCode == 113) {
				break;//break를 만나면 while문을 빠져나오게됨
				//반복문을 빠져나오기위해서는 break 필수
			}
			System.out.println(keyCode);
		} 
		System.out.println("종료");
	}
}

//07.26.월.복습내용
//// [continueKeyCodeReadExample.java]
//while(true) {	
//try {
//	System.out.printf("keCode: %d\n",System.in.read());									
//	keyCode = System.in.read(); //
//} catch (IOException e) {
//	e.printStackTrace();
//}
//}
