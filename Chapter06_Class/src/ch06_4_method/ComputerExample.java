package ch06_4_method;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
//								"100¹øÁö"
		
		int result1 = myCom.sum1(values1);
		System.out.println("myCom.sum(int[]) : " + result1); // 6
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("myCom.sum(new int[]{}) : " + result2); // 15
		
		int result3 = myCom.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("myCom.sum2(int...values) : " + result3); // 55
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4); // 15
	}	
} 
	
