package ch02_4_console_in_out;

import java.io.IOException;

public class ContinueKeyCodeReadExample {
	public static void main(String[] args) throws IOException {
		// ���ܸ� �ȿ��� ó���ϴ°� �ƴ϶� �׳� ����������~ �ϴ°���
		// �̰žȾ��� �����Ȼ����
		int keyCode;

		//�ݺ��� (for....Ƚ��, while ����)
		while(true) {
			keyCode = System.in.read();
			// ���� ���� �ذ��!! ������ ���� Ŀ�� ��� add~������ ��!!
			if(keyCode == 113) {
				break;//break�� ������ while���� ���������Ե�
				//�ݺ����� �������������ؼ��� break �ʼ�
			}
			System.out.println(keyCode);
		} 
		System.out.println("����");
	}
}

//07.26.��.��������
//// [continueKeyCodeReadExample.java]
//while(true) {	
//try {
//	System.out.printf("keCode: %d\n",System.in.read());									
//	keyCode = System.in.read(); //
//} catch (IOException e) {
//	e.printStackTrace();
//}
//}
