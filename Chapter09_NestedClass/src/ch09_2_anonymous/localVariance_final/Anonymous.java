package ch09_2_anonymous.localVariance_final;

interface Calculatable { // 인터페이스 선언
	int sum(); // 추상 메소드 선언
}

public class Anonymous {
	int field; // 필드 선언 (언제나 수정 가능) 
	
	public void method(final int arg1, int arg2) { 
		// 메소드 내부에서 선언된 매개변수나 로컬 변수들은 모두 수정이 불가능
		// 전부 final 특성을 지닌다.
		final int var1 = 40;
		int var2 = 50; 
		
		field = 10;
		
		// arg1 = 20; // final을 붙여도
		// arg2 = 20; // final을 안붙여도 둘다 값 수정이 불가능하다. 
		
		// var1 = 30; // final을 붙여도
		// var2 = 30; // final을 안붙여도 둘다 값 수정이 불가능하다.
		
		// 만약 값 수정을 시도한다면 아래 sum() 메소드 계산 식에서 컴파일 에러 발생함
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
