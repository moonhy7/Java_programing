package mlti_thread;

import java.awt.Toolkit;

public class BeepPrintExample2 { 
	public static void main(String[] args) {
		 // 1�� �ֱ�� Beep�� �߻��� ���ÿ�  ���� ���
		 
		
		// ������
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
			System.out.println(i+1 + ".��~");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
