package Implementation;

import java.util.Scanner;

public class Star_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(' ');
			} 
			for(int j=0; j<i*2+1; j++) {
				System.out.print('*');
			}
			System.out.println();	
		}
		
		for(int i=0; i<n-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(' ');
			} 
			for(int j=0; j<(n-i-1)*2-1; j++) {
				System.out.print('*');
			}
			System.out.println();	
		}
		
	}
}
