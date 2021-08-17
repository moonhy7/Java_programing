package ch12_2_thread_control;

public class PrintThread2 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		try {
			while(!stop) {
				System.out.println("실행 중");
				// 스레드 가 실행대기, 실행 상태일 때는 예외가 발생 X
				// 스레드가 일시정지(sleep) 상태가 되지않으면 interrupt
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
