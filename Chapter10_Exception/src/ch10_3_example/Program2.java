package ch10_3_example;

public class Program2 {
	public static void main(String[] args) {
		
		// ���� ó��
		try { 
			lib.write(); //write() �޼ҵ� ����
		} catch (InterruptedException e) { // ���� �߻��Ǹ� e�� ���ܸ� �޾ƿ���
			e.printStackTrace(); // e ���� ������ ����ϱ�
		}
		System.out.println("���α׷� ����");	
	}
}
// ���̺귯�� Ŭ����
class lib { 
	public static void write() throws InterruptedException { // InterruptedException ���ܰ� �߻��ϸ� ������
		Thread.sleep(1000); // 1�� ����ϱ�
	}
}
