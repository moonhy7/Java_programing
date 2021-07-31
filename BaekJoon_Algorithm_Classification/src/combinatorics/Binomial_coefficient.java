package combinatorics;

import java.util.Scanner;

public class Binomial_coefficient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum_N =1;
		int sum_K1 =1;
		int sum_K2 =1;
		
		for(int i=1;i<=N;i++) {
			sum_N *= i;
		} 
		
		for(int i=1;i<=K;i++) {
			sum_K1 *= i;
		} 
		for(int i=1;i<=N-K;i++) {
			sum_K2 *= i;
		} 
		
		
		System.out.println(sum_N / (sum_K1 * sum_K2));
	
	}
	
	
	
}
