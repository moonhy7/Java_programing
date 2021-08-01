package mathematics;

import java.util.Scanner;

public class SumWithComma {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String s = sc.next();
		String[] arrStr = s.split(",");
		
		int[] arrInt = new int[arrStr.length];
		int sum = 0;
		
		for(int i=0; i<arrStr.length;i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
			sum += arrInt[i];
		}
		System.out.println(sum);
		
	}
}
