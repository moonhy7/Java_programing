package ch06_4_method;

public class Computer2Example {
	public static void main(String[] args) {
//		�ߺ��ڵ� ���� ����
		Computer2 myCom = new Computer2();
	
		int[] values1 = {1, 2, 3}; // �Ʒ��� ���� ���� �־���
		myCom.intList = values1;
		
		int result1 = myCom.sum1(values1);
		System.out.println("myCom.sum(int[]) : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("myCom.sum(new int[]{}) : " + result2);
		
		int result3 = myCom.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("myCom.sum2(int...values) : " + result3);
	}
}
