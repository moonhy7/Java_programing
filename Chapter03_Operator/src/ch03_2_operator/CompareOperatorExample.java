package ch03_2_operator;

public class CompareOperatorExample {
	public static void main(String[] args) throws InterruptedException {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
//		boolean result4 = (char1 < char2);
//		System.out.println("result4 =" + result4);
		System.out.printf("result4 = %b\n", char1 < char2);
		
		int count = 10;
		while(count != 0) {
			Thread.sleep(500);
			System.out.println(count--);
		}
		System.out.println("fire!!!");
		
		
	}
}
