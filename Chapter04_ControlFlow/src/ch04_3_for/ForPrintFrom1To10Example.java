package ch04_3_for;

public class ForPrintFrom1To10Example {
	 public static void main(String[] args) {
		 
		 // while은 조건중심, for는 횟수중심!!
		 
		 
		 // while 문
		 // sum = 1+2+3+4+5;
		 int sum = 0;
//		 int i = 0;
//		 while(i <= 5) {
//			 sum += i;
//			 i++;
//		 }
//		 System.out.println("1~5의 합: " + sum);
		 
		 // for문
		 
		 for(int i = 1; i <= 5;i++) {
			 sum += i;
		 }
		 System.out.println("1~5의 합: " + sum);
	}
}
