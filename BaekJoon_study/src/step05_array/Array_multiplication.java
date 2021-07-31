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
		int[] arrCount = new int[10];
		
		
		for(int i=1;i<=n; i++) {
			arrNum[n-i] = mulNum % 10;
			mulNum /= 10;
		}
		int count = 0;
		for(int i=0; i<10; i++) {
			for(int j=0; j<n; j++) {
				if(arrNum[j]==i) {
					arrCount[i] += 1;
				}
			} 
			System.out.println(arrCount[i]);
		}
	}
}