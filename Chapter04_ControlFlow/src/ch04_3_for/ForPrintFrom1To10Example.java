package ch04_3_for;

public class ForPrintFrom1To10Example {
	 public static void main(String[] args) {
		 
		 // while�� �����߽�, for�� Ƚ���߽�!!
		 
		 
		 // while ��
		 // sum = 1+2+3+4+5;
		 int sum = 0;
//		 int i = 0;
//		 while(i <= 5) {
//			 sum += i;
//			 i++;
//		 }
//		 System.out.println("1~5�� ��: " + sum);
		 
		 // for��
		 
		 for(int i = 1; i <= 5;i++) {
			 sum += i;
		 }
		 System.out.println("1~5�� ��: " + sum);
	}
}
