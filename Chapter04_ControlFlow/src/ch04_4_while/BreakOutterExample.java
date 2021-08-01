package ch04_4_while;

public class BreakOutterExample {
	public static void main(String[] args) {
		Escape: for(char upper='A'; upper<='Z';upper++) {
			for(char lower='a';lower<'z';lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Escape; // 이름은 아무렇게나 지어도됨
					// 소문자가  g가 되면 바로 Escape가 써있는 곳으로 탈출하겠다는 의미
				}
			}
		}
	System.out.println("프로그램 실행 종료");
	}
}
