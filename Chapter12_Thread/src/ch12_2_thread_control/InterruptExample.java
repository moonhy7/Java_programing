package ch12_2_thread_control;

public class InterruptExample {
	public static void main(String[] args) {
		Thread th = new PrintThread2();
		th.start();

		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}

		// �����带 �����ϱ� ���� Interrupte
		th.interrupt();
	}
}
