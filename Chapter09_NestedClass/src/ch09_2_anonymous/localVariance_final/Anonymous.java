package ch09_2_anonymous.localVariance_final;

interface Calculatable {
	int sum();
}

public class Anonymous {
	int field;
	
	public void method(final int arg1, int arg2) { 
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
