package Implementation;

import java.util.Scanner;

public class star_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i=0; i<num; i++) {
			if(i%2==0) {
				for(int j=0; j<num;j++) {
					System.out.print("* ");
				} System.out.println();
			}
			else {
				for(int j=0; j<num; j++) {
					System.out.print(" *");
				}  System.out.println();
			}
		}

	}
}
