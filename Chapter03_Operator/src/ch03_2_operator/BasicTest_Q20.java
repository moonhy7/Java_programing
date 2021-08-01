package ch03_2_operator;

public class BasicTest_Q20 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		
//		num1 += 10 // =+ 라고쓰지마~
//		num1 = num1 + 10
		
		result = ((num1 += 10) <0 && (num2 += 10) > 0); //and 조건
		System.out.printf("num1=%d, num2=%d\n",num1,num2); // 10, 0  
		
//		num1 = 10, num2= 0
		result = ((num1 += 10) >0 || (num2 += 10) > 0); //or 조건
		System.out.printf("num1=%d, num2=%d\n",num1,num2); // 20, 0
		
		
	
	}
}

// 1번조건 and 2번조건
// and조건 쓸때 1번조건이 false면 뒤에 코드는 돌지않음 (이미 false로 결론 났으니까!!)
// or 조건 쓸때 1번조건이 ture면 뒤에 코드는 돌지않음(이미 true로 결론났으니까!!)

// 그래서 and조건쓸때는 1번조건에 되도록 false되기 쉬운 조건을 쓰고
// or 조건쓸때는 1번조건에 되도록 true인 조건을 써준다. 그래야 실행속도가 빨라짐
