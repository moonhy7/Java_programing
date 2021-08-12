package ch10_3_example;

import java.util.InputMismatchException; // util에 있는건 import 필수
import java.util.Scanner; // but, lang에 있는건 그냥 쓸 수 있음

public class ExceptionCase_StringAndDouble {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력받기 예) 3,4 3/4 나누기 실행하고
		// 입력받은 숫자와 나누기 결과를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		// 예외 나온거 밑 줄 클릭하면 어디서 예외나온지 알려줌
		// 그 코드를 catch안으로 넣어줌

		try {
			System.out.print("a / b 식에 사용될 a 값을 입력하세요 > ");
			double n1 = sc.nextDouble();
			
			System.out.print("a / b 식에 사용될 b 값을 입력하세요 > ");
			double n2 = sc.nextDouble();
			
			System.out.printf("%f / %f = %f\n", n1, n2, (double)n1/n2);
		
		} catch(InputMismatchException e) {
			System.out.println("문자열로 나눌 수 없습니다.");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}


