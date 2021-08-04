package mathematics;

import java.util.Scanner;

public class Vacation_homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		
		int countKorean = 0;
		while (A>0) {
			A -= C;
			countKorean++;
		}
		
		int countMath = 0;
		while (B>0) {
			B -= D;
			countMath++;
		}
		
//		System.out.println(countKorean);
//		System.out.println(countMath);
		
		if(countKorean >= countMath) {
			System.out.println(L-countKorean);
		} else {
			System.out.println(L-countMath);
		}
	}
}
