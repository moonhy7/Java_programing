package step07_string;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		String strNum = sc.next();
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(strNum.substring(i, i+1));
			sum += arr[i];
		}
		System.out.println(sum);	
	}
}
