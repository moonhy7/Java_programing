package ch02_4_console_in_out;

import java.io.IOException;

public class KeyCodeExample {
	public static void main(String[] args) throws IOException {
		
//		[키보드로부터 입력된 내용을 변수에 저장하고 출력하기]
//		System.in.read();
				
		int keyCode;
		
		keyCode = System.in.read();	
		System.out.println("KeyCode: "+ keyCode);
		
		keyCode = System.in.read();	
		System.out.println("KeyCode: "+ keyCode);
		
		keyCode = System.in.read();	
		System.out.println("KeyCode: "+ keyCode);
		

		
//	의미: 
//	buffer란?	
		
	}
}
