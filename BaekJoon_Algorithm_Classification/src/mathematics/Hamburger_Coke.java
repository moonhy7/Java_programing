package mathematics;

import java.util.Scanner;

public class Hamburger_Coke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Burger = new int[3];
		int[] Coke = new int[2];
		
		for(int i=0; i<3; i++) {
			Burger[i] = sc.nextInt();
		}
		for(int i=0; i<2; i++) {
			Coke[i] = sc.nextInt();
		}
		
		int minBurger = Burger[0];
		int minCoke = Coke[0];
		
		for(int i=0; i<3; i++) {
			if(minBurger > Burger[i]) {
				minBurger = Burger[i];
			}
		}
		
		for(int i=0; i<2; i++) {
			if(minCoke > Coke[i]) {
				minCoke = Coke[i];
			}
		}
		
		int minSetMenu = minBurger + minCoke -50;
		System.out.println(minSetMenu);
		
		
		
	}
}
