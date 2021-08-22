package reviewProblem.ch09.prob1;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// 익명 객체 필드 사용
		anony.field.start();
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 익명 객체 매개값 사용
		anony.method2(
			new Worker() {
				@Override
				public void start() {
					System.out.println("테스틀를 합니다.");
				}
			}
		);
	}
}
