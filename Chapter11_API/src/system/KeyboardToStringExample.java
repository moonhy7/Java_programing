package system;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		
		System.out.println("�Է�: ");
		
		try {
			// �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
			int readByteNo = System.in.read(bytes);
			
			// �迭�� ���ڿ��� ��ȯ
			String str = new String(bytes, 0, readByteNo - 2);
			System.out.println(str);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
