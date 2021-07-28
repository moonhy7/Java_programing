package ch04_1_if;

public class IfExample {
	public static void main(String[] args) {
		
		// 조건이 2개일때 (if와 삼항연산자)
		
//		int score = 95;
//		char grade;	// 경고 표시는 컴파일하는데 문제없음, 하지만 syso선언이 안되어서 결과로 나올게 없다! 를 보여줌
//		
//		if(score > 90) {
//			grade = 'A';
//		} else {
//			grade = 'B';
//		}
//		System.out.println(grade);
//		
////		이거아니면 저거야! 그럴때 if를 쓴다!!
////		삼항연산자랑 완전히 똑같다!
//		grade = (score>90) ? 'A' :'B';
//		System.out.println(grade);
		
		
		// 조건이 3개일때 (if와 삼항연산자)
//		int score2 = 85;
//		grade = (score2>90) ? 'A' : ((score2>80) ? 'B' : 'C');
//		
//		System.out.println(grade);
//		
//		if(score2 > 90) {
//			grade = 'A';
//		} else {
//			if(score2 > 80) {
//				grade = 'B';
//			}
//			else {
//				grade = 'C';
//			}
//		}
//		System.out.println(grade);
		
		//else if 이용하기
		int score = 75;
		char grade;
		
		if (score > 90) {
			grade = 'A';
		} else if(score >= 80 && score < 90) {
			grade = 'B';
		} else if(score >= 70 && score <80) {
			grade = 'C';
		} else if(score >= 60 && score < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		// 확률상 가능성이 많은 애를 위로 올리는게 실제 지침서에 있음
		// 그러나 여기서 D등급애들 수가 가장 많다고 해서 맨위로 올리지 않음!
		// 눈에 보기가 불편하니까
		
		System.out.println(grade); // else가 없어서 에러 발생
//		이클립스는 친절하게도 score = 55점 일 수도 있는데 그 경우에는 안된다~ 를 미리 에러로 알려주는것
	
		
		
		
//		조건이 3개만 해도 너무 복잡함
//		그래서 나온게 switch문

		
	}
}
