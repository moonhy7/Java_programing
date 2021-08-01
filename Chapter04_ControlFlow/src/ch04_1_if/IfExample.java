package ch04_1_if;

public class IfExample {
	public static void main(String[] args) {
		
		// 조건이 2개일때 (if와 삼항연산자)
		
		int score = 95;
		char grade;	
		// 전구 표시 : 경고 표시는 컴파일하는데 문제없음, 하지만 syso선언이 안되어서 결과로 나올게 없다! 를 보여줌
		
		if(score > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		System.out.println(grade);
		
		// 이거아니면 저거야! 그럴때 if를 쓴다!!
		// 삼항연산자랑 완전히 똑같다!
		grade = (score>90) ? 'A' :'B';
		System.out.println(grade);

		// 조건이 3개일때 (if와 삼항연산자)
		
		// if문
		int score1 = 85;
		
		if(score1 > 90) {
			grade = 'A';
		} else {
			if(score1 > 80) {
				grade = 'B';
			}
			else {
				grade = 'C';
			}
		} System.out.println(grade);

		// 삼항 연산자
		grade = (score1>90) ? 'A' : ((score1>80) ? 'B' : 'C');
		System.out.println(grade);
		
		
		//else if 이용하기
		int score2 = 75;
		char grade2;
		
		if (score2 > 90) {
			grade2 = 'A';
		} else if(score2 >= 80 && score2 < 90) {
			grade2 = 'B';
		} else if(score2 >= 70 && score2 <80) {
			grade2 = 'C';
		} else if(score2 >= 60 && score2 < 70) {
			grade2 = 'D';
		} else {
			grade2 = 'F';
		}
		// 확률상 가능성이 많은 애를 위로 올리는게 실제 지침서에 있음
		// 그러나 여기서 D등급애들 수가 가장 많다고 해서 맨위로 올리지 않음!
		// 눈에 보기가 불편하니까
		
		System.out.println(grade2); // C
		// else가 없어서 에러 발생
//		이클립스는 친절하게도 score = 55점 일 수도 있는데 그 경우에는 안된다~ 를 미리 에러로 알려주는것

//		조건이 3개만 해도 너무 복잡함
//		그래서 나온게 switch문

		
	}
}
