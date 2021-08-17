package ch12_1_mlti_thread;

public class ThreadA extends Thread { // 메소드 자동 생성 -> Ctrl + Space
	ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for(int i=0; i<2000; i++) {
			System.out.println(getName() + " 가 출력한 내용");
		}
	}
}
