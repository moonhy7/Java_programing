package ch04_3_for;

public class ForSumFrom1to100Example2 {
	public static void main(String[] args) {
//		int sum = 0;
//		int i = 0;
//		for(i=1;i<=100;i++) {
//			sum += i;
//		}
//		System.out.println("1~" + (i-1) + " 합 : " + sum); 
		//for문을 빠져나온 순간 i값은 101이므로 100이 나오게 하려면 i-1을 출력해야함!!
		
		int sum = 0;
		 int i = 1;
		 while(i <= 1000) {
			 sum += i;
			 i++;
		 }
		 System.out.println("1~5의 합: " + sum);
		 
	}
}

// 디버깅하는법 : 더블클릭 run-debug or 벌레 클릭
