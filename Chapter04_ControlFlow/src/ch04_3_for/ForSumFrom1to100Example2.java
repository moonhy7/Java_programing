package ch04_3_for;

public class ForSumFrom1to100Example2 {
	public static void main(String[] args) {
//		int sum = 0;
//		int i = 0;
//		for(i=1;i<=100;i++) {
//			sum += i;
//		}
//		System.out.println("1~" + (i-1) + " �� : " + sum); //1~100 �� : 5050

		//for���� �������� ���� i���� 101�̹Ƿ� 100�� ������ �Ϸ��� i-1�� ����ؾ���!!
		
		int sum = 0;
		 int i = 1;
		 while(i <= 100) {
			 sum += i;
			 i++;
		 }
		 System.out.println("1~100�� ��: " + sum);
	}
}

// ������ϴ¹� : ����Ŭ�� run-debug or ���� Ŭ��
