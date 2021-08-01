package string;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String eng = str.substring(0,1);
		String sign = str.substring(1);

		int scoreEng = 0;
		double scoreSign = 0;
		
		switch(eng) {
		case "A":
			scoreEng = 4;
			break;
		case "B":
			scoreEng = 3;
			break;
		case "C":
			scoreEng = 2;
			break;
		case "D":
			scoreEng = 1;
			break;
		}
		
		switch(sign) {
		case "+":
			scoreSign = 0.3;
			break;
		case "0":
			scoreSign = 0;
			break;
		case "-":
			scoreSign = -0.3;
			break;
		}
		System.out.println(scoreEng+scoreSign);
	}
}
