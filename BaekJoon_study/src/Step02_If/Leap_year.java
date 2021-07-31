package Step02_If;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		if(num%4==0 && ((num%100 != 0) || (num%400==0))) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
	}
}
