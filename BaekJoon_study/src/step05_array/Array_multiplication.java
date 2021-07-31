package step05_array;
import java.util.Scanner;

public class Array_multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();
		int B =sc.nextInt();
		int C =sc.nextInt();
		int mulNum = A*B*C;
		
		int n = Integer.toString(mulNum).length();
		int[] arrNum = new int[n];
		int[] arrCount = new int[n];
		
		
		for(int i=1;i<=n; i++) {
			arrNum[n-i] = mulNum % 10;
			mulNum /= 10;
		}
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=1; j<=10; j++) {
				if(arrNum[i]==j) {
					count += 1;
				}
			}
		}
		
	
	}
}