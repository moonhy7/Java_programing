package ch03_2_operator;

public class BitOperation {
	public static void main(String[] args) {
		/*************************************
		 * ��Ʈ������( |, &, ^, ~, <<, >> )
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
		
//		String str = "71";
//		int num = Integer.parseInt(str);
//		System.out.println(num);
		
//		1001 -> 9
//		1011 -> 11
//	&	1001 -> 9
//	||	1011 -> 11
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("10����: " + (a & b));
		System.out.println("10����: " + (a | b));
		
		System.out.println("3<<2: " + (3<<2));
//		0011 -> 1100 (��Ʈ�� �������� 2 ĭ �̵�)
		System.out.println("128>>5: " + (128>>5));
//		1000 0000 -> 0000 0100 (��Ʈ�� ���������� 5 ĭ �̵�)
		
	}
}
