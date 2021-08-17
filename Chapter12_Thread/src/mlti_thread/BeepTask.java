package mlti_thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	@Override
	public void run() {
		toolkit.beep();
		try { 
			Thread.sleep(1000);
		} catch(Exception e) {}
	}
}
