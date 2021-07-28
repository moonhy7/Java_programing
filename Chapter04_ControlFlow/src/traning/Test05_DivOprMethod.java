package traning;

public class Test05_DivOprMethod {
	public static void main(String[] args) {
		// 몫과 나머지를 출력하는 메소드를 만들고
		// 실행하는 코드를 작성하시오.
		// 예) divOpr(7,3);
		// 콘솔출력 -> "몫: 2, 나머지: 1"
		divOpr(7,3);
	}
	private static void divOpr(int i, int j) {
		System.out.printf("몫: %d, 나머지: %d\n", i/j, i%j);
	}
	
}
