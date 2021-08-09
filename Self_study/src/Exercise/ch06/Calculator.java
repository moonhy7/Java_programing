package Exercise.ch06;

public class Calculator {
	static double pi = 3.14159;
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	
//	String color;	// 인스턴스 필드
//	void setColor() { // 인스턴스 필드의 값(색깔)을 변경하는 메소드는 인스턴스 메소드로 선언
//		this.color = color;
//	}
//	static int plus(int x, int y) { // 외부에서 매개값을 받아서 수행하는 메소드는 정적 메소드로 선언
//		int result = x + y;
//		return result;
//	}
//	
	//메소드
//	int plus(int x, int y) { // 합 메소드
//		int result = x + y; 
//		return result;
//	}
//	
//	double avg(int x, int y) { // 평균 메소드
//		double sum = x + y;
//		double result = sum / 2;
//		return result;
//	}
//	
//	void execute() { // 기능 수행 메소드
//		double result = avg(7,10);
//		println("실행결과 : " + result);
//	}
//	
//	void println(String message) { // 출력 메소드
//		System.out.println(message);
//	}
}