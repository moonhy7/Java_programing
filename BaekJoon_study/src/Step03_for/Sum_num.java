package Step03_for;

import java.util.Scanner;

public class Sum_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println("Case #"+i+": " + (x+y));
			
		}
	}
}
