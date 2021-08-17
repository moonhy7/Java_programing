package ch12_1_mlti_thread;

class A extends Thread {
	@Override
	public void run() {
		
	}
}

public class MainThreadExample {
	public static void main(String[] args) {
		/* [��Ƽ �������� ����]
		 * ���� �����尡 ���� ���μ��� ������ �ڿ� �����ϸ� ����� ����
		 * - ����ȭ(synchronization)
		 * - ��������(deadlock)
		 */
		
		Thread th = new A();
		th.start();
		
		Calculator calc = new Calculator();
		
		Thread jung = new Thread() {
			@Override
			public void run() {
				calc.setMemory(100);
			}
		};
		jung.setName("Jung's Thread");
		
		Thread park = new Thread(new Runnable() {
		@Override
		public void run() {
			calc.setMemory(50);
		}
	});
		park.setName("Park's Thread");
		
		jung.start();
		park.start();
	}
}
