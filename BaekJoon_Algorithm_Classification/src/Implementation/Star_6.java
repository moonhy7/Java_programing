package Implementation;

import java.util.Scanner;

public class Star_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(' ');
			} 
			for(int j=0; j<(n-i)*2-1; j++) {
				System.out.print('*');
			}

			System.out.println();	
		}
	}
}
