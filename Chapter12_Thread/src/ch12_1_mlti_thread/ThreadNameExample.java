package ch12_1_mlti_thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		// �� �ڵ带 �����ϴ� ������ ��ü ���
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		// ThreadA ��ü ����
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();
		
		// ThreadB ��ü ����
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadB.start();
	}
}
