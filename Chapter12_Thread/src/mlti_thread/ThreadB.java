package mlti_thread;

public class ThreadB extends Thread { // �޼ҵ� �ڵ� ���� -> Ctrl + Space
	ThreadB() {
		setName("ThreadB");
	}
	
	@Override
	public void run() {
		for(int i=0; i<2000; i++) {
			System.out.println(getName() + " �� ����� ����");
		}
	}
}
