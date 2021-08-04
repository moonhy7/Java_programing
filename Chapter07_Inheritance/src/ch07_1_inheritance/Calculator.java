package ch07_1_inheritance;

public class Calculator {
	// 필드
	static final double PI = 3.141592;
	
	// 메소드
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return PI * r * r;
	}
	
}
