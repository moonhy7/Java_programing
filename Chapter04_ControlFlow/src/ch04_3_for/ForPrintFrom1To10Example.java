package ch04_3_for;

public class ForPrintFrom1To10Example {
	 public static void main(String[] args) {
		 
		 // while�� �����߽�, for�� Ƚ���߽�!!
		// sum = 1+2+3+4+5;
		 
		 // while ��
		 int sum1 = 0;
		 int i = 0;
		 while(i <= 5) {
			 sum1 += i;
			 i++;
		 } System.out.println("1~5�� ��: " + sum1); //1~5�� ��: 15
		 
		 // for��
		 int sum2 = 0;
		 for(int j = 1; j <= 5; j++) {
			 sum2 += j;
		 } System.out.println("1~5�� ��: " + sum2); //1~5�� ��: 15
	}
}
