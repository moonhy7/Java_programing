package ch02_4_console_in_out;

import java.io.IOException;

public class QStopExample {
	public static void main(String[] args) {
				
//		[QStopExample.java]
		 
		boolean working = true;
		int keyCode;
		while(true)  {
			try {
				keyCode = System.in.read();
				System.out.printf("keCode: %d\n",System.in.read());
				
//				if(keyCode == 113) //이거보단 아래 q가 나아보임
				if(keyCode == 'q' || keyCode == 'Q') {
						working = false;
				} 
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}	// ->
		
//			System.out.println("프로그램이 정상적으로 종료되었습니다.");				
			
	} 
}
	
