package Step03_for;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int n = scn.nextInt();
		for(int i = 1; i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
