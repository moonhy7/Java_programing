package ch10_3_example;

public class Calculator { // 계산기 유틸, 언제나 쓸 수 있는 라이브러리 코드임
	
	// 업무적으로 x + y 값이 1,000을 넘으면 에러 발생
	// 업무적으로 x + y 값이 음수이면 에러 발생
	public static int add(int x, int y) throws BizThousandOverException, BizNagativeNumberException  {
		int result = x + y;
		if(result >1_000) {
			throw new BizThousandOverException(); // 예외 객체를 던진다.
		}
		if(result < 0) {
			throw new BizNagativeNumberException(); // 예외객체를 여러 개 만들 수 있음
		}
		return result;
	}
	
	// 업무적으로 x - y 값이 음수이면 에러 발생
	public static int sub(int x, int y) throws BizNagativeNumberException {
		int result = x - y;
		if(result < 0) {
			throw new BizNagativeNumberException();
			}
		return result;
	}
	
	public static int multi(int x, int y) {
		int result = x * y;
		return result;
	}
	
	// 업무적으로 y의 값이 0이면 에러 발생
	public static int div(int x, int y) throws BizDivedByZeroException {
		
		if(y==0) {
			throw new BizDivedByZeroException();
		}
		int result = x / y;
		return result;
	}
}
