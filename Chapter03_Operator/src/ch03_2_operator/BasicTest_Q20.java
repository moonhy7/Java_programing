package ch03_2_operator;

public class BasicTest_Q20 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		
//		num1 += 10 // =+ �������~
//		num1 = num1 + 10
		
		result = ((num1 += 10) <0 && (num2 += 10) > 0); //and ����
		System.out.printf("num1=%d, num2=%d\n",num1,num2); // 10, 0  
		
//		num1 = 10, num2= 0
		result = ((num1 += 10) >0 || (num2 += 10) > 0); //or ����
		System.out.printf("num1=%d, num2=%d\n",num1,num2); // 20, 0
		
		
	
	}
}

// 1������ and 2������
// and���� ���� 1�������� false�� �ڿ� �ڵ�� �������� (�̹� false�� ��� �����ϱ�!!)
// or ���� ���� 1�������� ture�� �ڿ� �ڵ�� ��������(�̹� true�� ��г����ϱ�!!)

// �׷��� and���Ǿ����� 1�����ǿ� �ǵ��� false�Ǳ� ���� ������ ����
// or ���Ǿ����� 1�����ǿ� �ǵ��� true�� ������ ���ش�. �׷��� ����ӵ��� ������
