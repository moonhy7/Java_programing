package ch02_4_console_in_out;

import java.io.IOException;

public class SystemInOut {
	public static void main(String[] args) throws IOException {
//		[KeyCodeExample.java]
				
//		int keyCode; // 2��° ���� : �ѹ��� ����� ��� ������ ���� �����������ʰ� print�� �ȿ��� �ص��� 
//		keyCode = System.in.read(); �����߻�
		
		try {
			System.out.printf("keCode: %d\n",System.in.read());
			System.out.printf("keCode: %d\n",System.in.read());
			System.out.printf("keCode: %d\n",System.in.read());
			System.out.printf("keCode: %d\n",System.in.read());
			System.out.printf("keCode: %d\n",System.in.read());
//												int�� ����
//			keyCode = System.in.read(); //
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
// System.in.read();�� ������ ����� ���� �߻�
//�������� : unhandled exception type IOEwception
//���� �ǹ� : 
//Add throws declaration Ŭ�����ٰ�
// 	public static void main(String[] args) throws IOException {
//�� �ٲ�°� (��� ���ܸ� ���������°� �ùٸ� ����� �ƴϴ�,���ܸ� ó�����־����)

// 
// abc : 97(��~a���о��ִ°ų�~) <---printf�� �� �� �϶�
//abc
//keCode: 97
//keCode: 98
//keCode: 99
//keCode: 13
//keCode: 10 (3�� �� �о���) <---printf�� �ټ� �� �϶�

// ��� : printf ���� ���� ��ŭ�� �о��ش�
// �� abcd...xyz �� �� �а������,, �ʹ� �����ϴ�!!
// ���� ��� �Է��ϴ� �� �������� �ذ��!!

// 1. while �̰͵� ����
// 2. scanner


