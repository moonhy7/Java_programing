package ch04_4_while;

public class BreakOutterExample {
	public static void main(String[] args) {
		Escape:for(char upper='A'; upper<='Z';upper++) {
			for(char lower='a';lower<'z';lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Escape; // 이름은 아무렇게나 지은것임, 
//					소문자=g 가 나오면 Escape 라고 써있는 곳으로 탈출하겠다!
				}
				
			}
		}
	System.out.println("프로그램 실행 종료");
	}
}
