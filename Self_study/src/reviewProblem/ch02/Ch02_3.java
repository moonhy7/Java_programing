package reviewProblem.ch02;

public class Ch02_3 {
	public static void main(String[] args) {

		// 확인문제
		char c1 = 'A';
		// char c2 = c1 + 1; // -> 에러남 (char + int 라서 값이 int임! )
		int c2 = c1 + 1; 
		System.out.println(c2); // 66 
		System.out.println((char)c2); // B
		
		
		// 6번
//		int x = 5;
//		int y = 2;
//		int result = x / y;
//		System.out.println(result);
		
		
		// 7번
//		int x = 5;
//		int y = 2;
//		double result = (double)x / y;
//		System.out.println(result);
		
		// 8번 
//		double var1 = 3.5;
//		double var2 = 2.7;
////		double result = var1 + var2;
//		int result = (int)(var1 + var2);
//		System.out.println(result);
		
		// 9번
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		// Integer.parseInt(var4); 안되는 이유 : 3.9가 double형이라서?
		int result1 = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		int result2 = (int)var1 + (int)var2 + (int)(var3 + Double.parseDouble(var4));
		int result3 = (int)(var1 + (int)var2 + var3 + Double.parseDouble(var4));
		int result4 = (int)(var1 + var2 + (int)var3 + Double.parseDouble(var4));
		int result5 = (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
		
		
		System.out.println(result1); // 9
		System.out.println(result2); // 9
		System.out.println(result3); // 9
		System.out.println(result4); // 9
		System.out.println(result5); // 9
		
		// 11번
		byte value1 = Byte.parseByte("10");
		int value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 = Double.parseDouble("3.14159");
		
		
		
	}
}
