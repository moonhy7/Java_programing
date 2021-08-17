package mlti_thread;

public class MainThreadExample {
	public static void main(String[] args) {
		/* [��Ƽ �������� ����]
		 * ���� �����尡 ���� ���μ��� ������ �ڿ� �����ϸ� ����� ����
		 * - ����ȭ(synchronization)
		 * - ��������(deadlock)
		 */
		
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
