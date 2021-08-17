package ch12_1_mlti_thread;

class A extends Thread {
	@Override
	public void run() {
		
	}
}

public class MainThreadExample {
	public static void main(String[] args) {
		/* [멀티 스레딩의 단점]
		 * 여러 스레드가 같은 프로세스 내에서 자원 공유하면 생기는 문제
		 * - 동기화(synchronization)
		 * - 교착상태(deadlock)
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
