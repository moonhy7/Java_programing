package mathematics;

import java.util.Scanner;

public class SumNum {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		String s = Integer.toString(X);
		
		int len = s.length();
		int[] arr = new int[s.length()];
		
		int sum = 0;
		for(int i=0;i<len;i++) {
			arr[i] = X % 10;
			X /= 10;
			sum += arr[i];
		} 
		System.out.println(sum);
	}
}
