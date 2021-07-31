package Step03_for;

import java.util.Scanner;
public class For_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int min =sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			if(arr[i]<min) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
