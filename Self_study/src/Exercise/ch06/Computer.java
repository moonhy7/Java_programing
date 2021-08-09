package Exercise.ch06;

public class Computer {
	// 방법1. 배열로 선언하기
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	// 방법2. ... 사용하기
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i< values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}


