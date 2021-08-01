package ch04_2_switch;

public class SwitchExample {
	public static void main(String[] args) {
		
		//분기로 나누는게 else if, 변수로 나누는게 switch ?
		
		//switch문은 예제를 하나 암기해놓으면 나중에 기억하기 좋음
		// break가 하나하나 있어야함, 
		
		// break가 돌아가는 예시를 보여줌
		int score = 85;
		char grade;
		switch(score) {
		case 100 : 
		case 99 : 
		case 85 :
		grade = 'A';
		break;
		case 89 : 
		case 88 :
			grade = 'B';
		}
		
		// break가 없을때 어떻게 흘러가는지 알 수 있는 예제
		// case 마다 break하는게 아니라 우리가 원하는 곳에만 선언
		// 쭉 통과시키도록 하기 위헤 중간 중간 만 break를 둠
		// 계절 
		int month = 3;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("겨울입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("겨울입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("겨울입니다.");
			break;
		}
		
	}
}
