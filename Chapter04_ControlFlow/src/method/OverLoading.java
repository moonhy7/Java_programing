package method;

import java.util.Scanner;

public class OverLoading {
	public static void main(String[] args) {
		// "�����ε�"
		showDisplay();
		Scanner scn = new Scanner(System.in);
	}
	
	private static void showDisplay() {
		System.out.println("------Menu------");
		System.out.println();
		System.out.println("1.���µ�� 2.�Ա� 3.���  4.����\n");
		System.out.println();
	}
}
