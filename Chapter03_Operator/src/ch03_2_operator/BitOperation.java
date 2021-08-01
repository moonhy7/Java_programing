package ch03_2_operator;

public class BitOperation {
	public static void main(String[] args) {
		/*************************************
		 * 비트연산자( |, &, ^, ~, <<, >> )
		 * 
		 * 
		 * 			  or	 and	 xor
		 * 	x	y	x | y	x & y	x ^ y
		 * ************************************
		 *  1	1	  1		  1		  0
		 *  1	0	  1		  0		  1
		 *  0 	1	  1		  0		  1
		 *  0 	0	  0		  0		  0
		 */
		
		int a = 9; 
		int b = 11;
		
		String str = "71";
		int num = Integer.parseInt(str);
		System.out.println(num); //71
		
//			1001 -> 9
//			1011 -> 11
// &  연산시 	1001 -> 9
// || 연산시 	1011 -> 11
		
		System.out.println(Integer.toBinaryString(a)); //1001
		System.out.println(Integer.toBinaryString(b)); //1011
		
		System.out.println("10진수: " + (a & b)); //9
		System.out.println("10진수: " + (a | b)); //11
		// &&, || 와 다른점은 비트끼리 비교연산이 가능하다는 점이다.
		
		System.out.println("3<<2: " + (3<<2)); //12
//		0011 -> 1100 (비트를 왼쪽으로 2 칸 이동)
		System.out.println("128>>5: " + (128>>5)); //4
//		1000 0000 -> 0000 0100 (비트를 오른쪽으로 5 칸 이동)
		
	}
}
