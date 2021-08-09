package Exercise.ch06;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		int[] values = {1,2,3};
		
		System.out.println(com.sum1(values));
		
		
		System.out.println(com.sum2(values));
	}
}