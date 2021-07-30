package step05_array;

import java.util.Scanner;

public class Step05_Array {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(scn.nextLine());
		}
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int num = 0;
		for(int i=0; i<arr.length;i++) {
			if(max==arr[i]) {
				num = i +1;
			}
		}	
		System.out.println(max);
		System.out.println(num);
	}	
}
