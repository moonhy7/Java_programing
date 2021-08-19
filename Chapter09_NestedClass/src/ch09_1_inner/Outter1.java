package ch09_1_inner;

public class Outter1 { // 자바 8 이후 부터는 final 생략 가능 (알아서 final 특성을 지정)
	public void method1(final int arg) { // 메소드 내에서
		final int localVariable = 1; // 로컬 변수와 매개변수를 final로 선언
		// arg = 100; // 컴파일 에러 발생
		// localVariable = 100; // 컴파일 에러 발생
		// 에러 내용 : The final local variable cannot be assigned.
		
		class Inner { // 로컬 클래스 
			public void method() {
				int result = arg + localVariable; // 로컬 클래스 내부에서 로컬 변수와 매개변수 사용 
			}
		}
	}
}
