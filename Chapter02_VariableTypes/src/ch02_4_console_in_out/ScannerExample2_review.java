package ch02_4_console_in_out;

import java.util.Scanner;

public class ScannerExample2_review {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "";

// �޴� ����
		while(true) {
			System.out.println("��________________��");
			System.out.println("             ��     ��               ");
			System.out.println("��________________��");
			str = scn.nextLine();
			System.out.printf("�Է��Ͻ� �޴��� \"%s\"�Դϴ�.\n",str);
			if(str.equalsIgnoreCase("q")) {
				System.out.println("����");
				break;
			} 
		} 
	}
} 