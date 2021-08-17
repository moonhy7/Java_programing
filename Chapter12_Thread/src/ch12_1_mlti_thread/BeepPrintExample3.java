package ch12_1_mlti_thread;

public class BeepPrintExample3 { 
	public static void main(String[] args) {
		// Thread th1 = new Thread(new Task1());
		// Thread th2 = new Thread(new Task2());

		Thread th1 = new Thread() {
			@Override
			public void run() {		
			}
		};
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {		
			}
		});
		th1.start();
	}
}
