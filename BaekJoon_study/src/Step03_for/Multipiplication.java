package Step03_for;

import java.util.Scanner;

public class Multipiplication {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		for(int i=1; i<=9;i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
		
	}
}
