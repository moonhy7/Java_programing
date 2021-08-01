package mathematics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		boolean[] bool =new boolean[num];
		
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
			
	
			if (arr[i]==2) {
				bool[i] = true;
			} else {
				int c = 0;
				for(int j=2; j<arr[i]; j++) {
					if(arr[i]%j!=0) {
						c+=1;
					} 
				} 
				
				if(c == arr[i]-2) {
					bool[i] = true;
				}
			} 
			
		}
		int cycle = 0;
		for(int i=0;i<num;i++) {
			if(bool[i]==true) {
				cycle += 1;
			}
		}
		System.out.println(cycle);
		
		
	}
}
