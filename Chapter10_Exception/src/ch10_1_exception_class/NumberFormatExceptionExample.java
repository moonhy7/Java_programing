package ch10_1_exception_class;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		
		String data1 ="200";
		String data2 ="a300";
	
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		
		System.out.printf("%d + %d = %d\n", value1, value2, result);
	}
}
