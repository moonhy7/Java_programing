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
				
//				if(keyCode == 113) //�̰ź��� �Ʒ� q�� ���ƺ���
				if(keyCode == 'q' || keyCode == 'Q') {
						working = false;
				} 
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}	// ->
		
//			System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");				
			
	} 
}
	
