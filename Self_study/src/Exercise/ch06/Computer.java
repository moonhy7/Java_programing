package Exercise.ch06;

public class Computer {
	// ���1. �迭�� �����ϱ�
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	// ���2. ... ����ϱ�
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i< values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}


