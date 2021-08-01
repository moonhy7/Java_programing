package mathematics;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean[] notPrime = new boolean[1001];
		
		for(int i=2;i<=32;i++) {
			for(int j=2; i*j<=1000; j++) {
				notPrime[i*j]= true;
			}
		}
		
		notPrime[1]=true;
		
		int answer =0;
		for(int i=0; i<num;i++) {
			int a = sc.nextInt();
			if(notPrime[a]==false) {
				answer++;
			}
			
		} System.out.println(answer);
	}
	
		
}

