package mlti_thread;

import java.awt.Toolkit;

public class BeepPrintExample2 { 
	public static void main(String[] args) {
		 // 1초 주기로 Beep음 발생과 동시에  문자 출력
		 
		
		// 스레드
		Thread th = new Thread(new BeepTask() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch(Exception e) {}
				}
			}
		});
		th.start();
		
		
		
		for(int i=0; i<5; i++) {
			System.out.println(i+1 + ".띵~");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
