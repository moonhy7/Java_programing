package ch02_4_console_in_out;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws IOException{ 
		
		Scanner scan = new Scanner(System.in);
		scan.hasNextLine();
		 
//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");

		String inputData;
//		scanner Ŭ������ ����� ������,�޼ҵ� ���� �޸𸮿� ���õ�
//		�̰� �ٷ� instance ��ü!! ���� ��������ְԵ�
//		new�� �� ������ϴ� ���� : instance�� ����ߵǼ�
//		���߿� Ŭ���� �Ҷ� �ڼ��� ���
		
		while(true) {
			inputData = scan.nextLine(); //���� �ϱ�..�ϱ�
			System.out.println("�Էµ� ���ڿ�:" + inputData);
			if(inputData.equals("q")) {
				break;
			}		
		}
		System.out.println("����");
	}
}
