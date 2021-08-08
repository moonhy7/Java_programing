package Exercise;

public class Calculator {
	//메소드
	int plus(int x, int y) { // 합 메소드
		int result = x + y; 
		return result;
	}
	
	double avg(int x, int y) { // 평균 메소드
		double sum = x + y;
		double result = sum / 2;
		return result;
	}
	
	void execute() { // 기능 수행 메소드
		double result = avg(7,10);
		println("실행결과 : " + result);
	}
	
	void println(String message) { // 출력 메소드
		System.out.println(message);
	}
}