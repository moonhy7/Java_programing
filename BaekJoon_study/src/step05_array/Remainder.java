package step05_array;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
	
		boolean[] bool = new boolean[42];

		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			bool[num%42] = true;
		}
		
		int sum=0;
		for(int i=0; i<42; i++) {
			if(bool[i]==true) {
				sum +=1;
			}
		}
	System.out.println(sum);
	}
}
