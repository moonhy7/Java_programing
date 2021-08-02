package ch02_4_console_in_out;

import java.io.IOException;

public class Not_QStop_Example {
	public static void main(String[] args) {
		
//		[QStopExample]
		while(true) {
			try {
				System.out.printf("keCode: %d\n",System.in.read());
//				break;									int형 숫자
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//			System.out.println("프로그램이 정상적으로 종료되었습니다.");
			
		
	} 
}
	
