package ch04_3_for;

public class ForPrintFrom1To10Example {
	 public static void main(String[] args) {
		 
		 // while은 조건중심, for는 횟수중심!!
		// sum = 1+2+3+4+5;
		 
		 // while 문
		 int sum1 = 0;
		 int i = 0;
		 while(i <= 5) {
			 sum1 += i;
			 i++;
		 } System.out.println("1~5의 합: " + sum1); //1~5의 합: 15
		 
		 // for문
		 int sum2 = 0;
		 for(int j = 1; j <= 5; j++) {
			 sum2 += j;
		 } System.out.println("1~5의 합: " + sum2); //1~5의 합: 15
	}
}
