package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력받기 예) 3,4 3/4 나누기 실행하고
		// 입력받은 숫자와 나누기 결과를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a / b 식에 사용될 a 값을 입력하세요 > ");
		int n1 = sc.nextInt();
		
		System.out.print("a / b 식에 사용될 b 값을 입력하세요 > ");
		int n2 = sc.nextInt();
		
		try {
			System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
