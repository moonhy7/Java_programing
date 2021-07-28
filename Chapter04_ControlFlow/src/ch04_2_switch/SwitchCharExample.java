package ch04_2_switch;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		switch(grade) {
		
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default: //If문에서 else 역할
			System.out.println("손님입니다.");
		// break; 안써도 됨 -> 어차피 맨마지막 줄이라 바로 빠져나감
		}
		
		String position ="과장";
		switch(position) {
		case "부장": // 에러가 난다면 case 뒤에는 int타입이 기본설정이라서
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
	}
}
