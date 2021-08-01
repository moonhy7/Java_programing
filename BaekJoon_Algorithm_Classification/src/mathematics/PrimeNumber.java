package mathematics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int count = 0;
		int j = 2;
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]==1) {
				break;
			}
			else if(arr[i]==2) {
				count += 1;
			}
			else {
				while(j<arr[i]) {
					while(arr[i]/j != 0) {
						j++;
						
					}		
				} count +=1;
			}
		}
		System.out.println(count);
		
	}
}
