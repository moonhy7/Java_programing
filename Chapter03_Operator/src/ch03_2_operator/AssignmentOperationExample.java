package ch03_2_operator;

public class AssignmentOperationExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result=" + result); // 10
		result -= 5;
		System.out.println("result=" + result); // 5
		result *= 3;
		System.out.println("result=" + result); //15 
		result /= 5;
		System.out.println("result=" + result); //3
		result %= 3;
		System.out.println("result=" + result); //0
	} 
}
