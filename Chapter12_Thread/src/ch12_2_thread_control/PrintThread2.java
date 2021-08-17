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
				System.out.println("���� ��");
				// ������ �� ������, ���� ������ ���� ���ܰ� �߻� X
				// �����尡 �Ͻ�����(sleep) ���°� ���������� interrupt
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
