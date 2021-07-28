package traning;

public class Test04_Continue {
	public static void main(String[] args) {
		// 필터링 문제 - continue문
		// 자연수 1부터 시작.. 모든 홀수를 더해.. 그 합이 언제(몇을 더했을때)
		// 1000을 넘어서는지, 그리고 1000을 넘어선 값은얼마?
		// 출력하는 프로그램을 작성하시오
		// while문 사용
		
		int num = 1;
		int sum = 0;
		
		// if문 한 개
//		while(sum<1000) {
//			if(num%2 != 0) {
//				sum += num;
//			} num++;
//		}
//		System.out.println(sum);

		// if문 두 개
		while(sum<1000) {	
			// 홀수 조건
			if(num%2 != 0) {
				sum += num;
			} 
			// 합 조건
			if(sum>1000) {
				System.out.println(num + "을 더할 때 1000을 넘습니다.");
				System.out.println("초과된 값: "+ sum);
				break;
			}
			num++;
		}
	
		
	}
}
