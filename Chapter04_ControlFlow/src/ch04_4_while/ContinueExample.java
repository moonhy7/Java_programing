package ch04_4_while;

public class ContinueExample {
	public static void main(String[] args) {
		// continue문은 필터링을 해줄 때 사용
		// 홀수를 넘어가는 이 예제를 반드시 떠올릴것
		// 짝수만 추출
		// 홀수는 continue해서 넘어가게 하자
		for(int i=1;i<=10;i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i+"\t");
		}
	}
}
