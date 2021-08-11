package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();

		int result1 = myCalc.add(1,2);
		int result2 = myCalc.sub(5,3);
		int result3 = myCalc.multi(1,3);
		int result4 = myCalc.div(1,1);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
	}
}

class Calculator {

	// ¸Þ¼Òµå
	int add(int x, int y) {
		return x + y;
	}
	int sub(int x, int y) {
		return x - y;
	}
	int multi(int x, int y) {
		return x * y;
	}
	int div(int x, int y) {
		return x / y;
	}
}
