package ch06_4_method;

public class Calculator_rectangle_Example {
	public static void main(String[] args) {
		Calculator_rectangle myCalcu = new Calculator_rectangle();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10,20);
		
		// 결과 출력
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}
}
