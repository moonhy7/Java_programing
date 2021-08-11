package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) { 
		
		// try-catch로 감싸던지 throw로 예외던지던지 하라고 빨간 줄이 생김
		
		try {
			System.out.println("add: " + Calculator.add(10000,-2));
			System.out.println("div: " + Calculator.div(10000,0));
			System.out.println("add: " + Calculator.add(1,-2));
		
		} catch (BizThousandOverException e) {
			e.printStackTrace();
//			System.out.println("결과값이 천을 넘습니다. 확인 요망!");
			
		} catch (BizNagativeNumberException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
//			System.out.println("결과값이 음수입니다. 확인 요망!");
		} catch (BizDivedByZeroException e) {
			System.out.println(e.toString());
//			System.out.println("0으로 나눌 수 없습니다. 확인 요망!");
		}
		
		
		// 무조건 마지막에 모두 들리는곳
		finally {
			System.out.println("입력값을 확인하세요~");
		}
		System.out.println("프로그램 정상 종료");

		
		// Add throws declaration 을 선택하면 또 던지는 것임
		// 그런데 main 메소드는 거의 말단까지 온 경우인건데 여기서마저 던져버리면 JVM으로 떠넘기게 되는것임/
		// 그렇게 하면 안된다. 
		// Surround with try/catch 를 클릭해주어야한다.
		
		
//		System.out.println("sub: " + Calculator.sub(5,3));
//		System.out.println("multi: " + Calculator.multi(1,3));
//		
//		
//		try {
//			System.out.println("div: " + Calculator.div(1,1));
//		} catch (BizDivedByZeroException e) {
//			e.printStackTrace();
//		}	
		
		
	}
}
