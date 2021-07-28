package traning;

public class Test03_While {
	public static void main(String[] args) {
		// 1000 이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력
		// 그 수들의 총합을 출력...
		//while문 이용
		
		int num = 1;
		int sum = 0;
		while(num <= 1000) {
			if (num%2==0 && num%7==0 ) {
			System.out.println(num);
			sum += num;
			}
			num++;		
		}	
		System.out.println("총합: " + sum);
	}
}
