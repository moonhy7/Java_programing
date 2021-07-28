package method;

import java.util.Scanner;

public class OverLoading {
	public static void main(String[] args) {
		// "오버로딩"
		showDisplay();
		Scanner scn = new Scanner(System.in);
	}
	
	private static void showDisplay() {
		System.out.println("------Menu------");
		System.out.println();
		System.out.println("1.계좌등록 2.입금 3.출금  4.종료\n");
		System.out.println();
	}
}
