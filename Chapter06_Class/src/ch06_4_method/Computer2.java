package ch06_4_method;

//중복된 코드 제거 버전
public class Computer2 {
	
	int[] intList;
	
	int sum() {
		return arraySum(this.intList);
	}
	int sum1(int[] arrs) {
		return arraySum(arrs);
	}
	int sum2(int...values) {
		return arraySum(values);
	}
	int arraySum(int[] ars) {
		int total = 0;
		for(int i=0; i<ars.length; i++) {
			total += ars[i];
		} 
		return total;
	}
}

