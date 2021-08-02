package ch5_2_array;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		int score1 = 83;
		int score2 = 90;
		int score3 = 87;
//			.
//			.
//			.
		int score4 = 75; // 학생 수가 많아질수록 코드가 길어짐

			
		//배열 예제 시작
//		int[] scores = {83, 90, 87}; // new 안쓰고 선언하는 방법
		
//		아래 틀린 선언
//		int[] scores;
//		scores = {83, 90, 87};
//		바로 한줄에 값목록을 선언해줄게 아니라면 무조건 new 연산자로 생성해야한다.
		
		//이렇게 두줄로 선언도 가능
		int[] scores;
		scores = new int[3];
		
//		int[] scores = new int[3]; // new 사용하여 선언
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 87;
		 
		System.out.println("score[0] : " + scores[0]);
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum / 3;
		System.out.println("평균 : " + avg);
	}
	
}
