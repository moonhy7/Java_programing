package ch10_3_example;

// java.lang에 있는건 그냥 쓸 수 있지만 java.util에 있는건 import 필수임
import java.util.InputMismatchException;
import java.util.Scanner; 

public class ExceptionCase_StringAndDouble {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력받기 예) 3,4 3/4 나누기 실행하고
		// 입력받은 숫자와 나누기 결과를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		// 예외 출력 결과 클릭하면 몇번째 라인에서 예외가 발생한건지 알려준다.
		// 그 코드는 예외 발생 가능성이 있는 코드이므로 catch 안으로 넣어준다.
		
		try {
			System.out.print("a / b 식에 사용될 a 값을 입력하세요 > ");
			double n1 = sc.nextDouble();
			
			System.out.print("a / b 식에 사용될 b 값을 입력하세요 > ");
			double n2 = sc.nextDouble();
			
			if(Double.isInfinite(n1/n2)) {
				throw new ArithmeticException(); 
				// infinity가 나오는 현상 해결 - 예외로 출력하고싶다면 그 예외 객체를 throw 하기
			}
			
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


