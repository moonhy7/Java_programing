package ch12_1_mlti_thread;

public class ThreadA extends Thread { // �޼ҵ� �ڵ� ���� -> Ctrl + Space
	ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for(int i=0; i<2000; i++) {
			System.out.println(getName() + " �� ����� ����");
		}
	}
}
