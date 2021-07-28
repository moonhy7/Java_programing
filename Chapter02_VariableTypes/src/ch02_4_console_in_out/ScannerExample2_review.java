package ch02_4_console_in_out;

import java.util.Scanner;

public class ScannerExample2_review {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "";
		
//		while(true) {
//			str = scn.nextLine();
//			System.out.printf("입력하신 문자열은 \"%s\"\n",str);
//			if(str.equalsIgnoreCase("q")) {
//				break;
//			}
//		}
//		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	
// 메뉴 고르기
		while(true) {
			System.out.println("♥________________♥");
			System.out.println("             메     뉴               ");
			System.out.println("♥________________♥");
			str = scn.nextLine();
			System.out.printf("입력하신 메뉴는 \"%s\"입니다.\n",str);
			if(str.equalsIgnoreCase("q")) {
				break;
			}
		}
	}
}