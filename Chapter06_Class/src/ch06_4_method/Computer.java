package ch06_4_method;

//�ڵ尡 �ߺ��Ǿ��־ ���� ���� ������
public class Computer {
	int sum1(int[] arrs) {
		int total = 0;
		for(int i=0; i<arrs.length; i++) {
			total += arrs[i];
		}
		return total;
	}
	
	int sum2(int ... values) {
		int total = 0;
		for(int i=0; i<values.length; i++) {
			total += values[i];
		}
		return total;
	}
} 

