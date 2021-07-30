package homework;

import java.io.IOException;

public class LogicalOperatorHW {
	public static void main(String[] args) throws IOException {
		// ch03_2_operator_LogicalOperatorExample 문제 변형
		// 문제 : 문자를 입력받아서 하는 걸로 변경
		
		int str;
		System.out.println("하나의 문자를 입력하시오 = ");
		str = (int)System.in.read();

		System.out.println(str);
		
		if ((str>=65) & (str<=90)) {
			System.out.println("대문자군요");
		}
		
		if ((str>=97) && (str<=122)) {
			System.out.println("소문자군요");
		}
		
		if (!(str<48) && !(str>57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
	}
}

