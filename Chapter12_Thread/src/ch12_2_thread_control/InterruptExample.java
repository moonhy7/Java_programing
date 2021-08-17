package ch12_2_thread_control;

public class InterruptExample {
	public static void main(String[] args) {
		Thread th = new PrintThread2();
		th.start();

		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}

		// 스레드를 종료하기 위해 Interrupte
		th.interrupt();
	}
}
