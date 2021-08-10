package reviewProblem.ch02;

import java.util.Scanner;

public class Ch02_4 {
	public static void main(String[] args) {
		//	break point ?
//		디버깅하는이유: 로그를 남겨야함
//		이클립스가 없을때? 디버그하려면?
//		실제로 syso i,j 찍어보면됨
//		사실 현업에서는 로그를 찍는 법이 따로 있음 , 기본 라이브러리 제공하므로 그것을 이용
	
		
		// 확인문제 1번
		String name1 = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.println("이름: " + name1);
		System.out.print("나이: " + age + "\n");
		System.out.printf("전화: %s-%s-%s",tel1,tel2,tel3);
		
		
/*		확인문제 2번
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째수: ");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째수: ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
*/		
		
		
		
		
		
//		확인문제 3번
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = scn.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String registNum = scn.nextLine();
		System.out.print("3. 전화번호: ");
		String phoneNum = scn.nextLine();
		
		System.out.println("\n[입력한 내용]");
		System.out.println(name);
		System.out.println(registNum);
		System.out.println(phoneNum);
		

		
		
		
	}
}
