package mlti_thread;

import java.awt.Toolkit;
 import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("���� ������ ������");
		setSize(300,500);
		setVisible(true);
	}
}

public class BeepPrintExample1 {
	public static void main(String[] args) {
		// new MyFrame();
		
		// 1�� �ֱ�� Beep�� �߻� �� ���� ���
		 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
		for(int i=0; i<5; i++) {
			System.out.println(i+1 + ".��~");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
