package ch5_2_multiArray;

public class AdvancedForExample {
	public static void main(String[] args) {
		// for문의 독특한 형태가 나옴
		// 단점: 읽기만 가능 쓰질 못함
		int[] scores = {97, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
