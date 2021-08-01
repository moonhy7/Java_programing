package step05_array;

import java.util.Scanner;

public class AvrStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int k=0; k<n;k++) {
			int num = sc.nextInt();
			int[] arr = new int[num];
			int sum = 0;

			for(int i=0; i<num; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}

			int avr = sum / num;

			int j = 0;
			int count = 0;
			while(j<num) {
				if(arr[j]>avr) {
					count += 1;
				}
				j++;
			}
			double rate = count*(double)100/num;
			System.out.print(String.format("%.3f", rate));
			System.out.println('%');
		}

	}

}
