package ch01_3_java_process;

public class RunStatementExample {
	public static void main(String[] args) {
		System.out.println("Hello");
		method1();
//		int x = 1;
//		int y = 1;
//		int result = x + y;
//				   = 3
//		System.out.println(result);
//		System.out.println(reslt); 스펠링틀린경우
//		아래 Problem 에서 에러내용 복사해서 구글링!
		
		
		/* [두 수의 합을 출력]
		 * 두 수를 선언
		 * 두 수의 합 연산
		 * 연산 결과 저장
		 * 저장된 값을 출력
		 */

		int x = 3;
		int y = 2;
		int z = x + y;
		System.out.println(z);
		
		
	}
	public static void method1() {
		System.out.println("Hello+++++");
	}
}
