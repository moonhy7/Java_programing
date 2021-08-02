package ch02_4_console_in_out;

public class PrintfExample {
	public static void main(String[] args) {
		System.out.printf("이름:%s\n", "김자바");
//		System.out.printf("이름:%s", "김자바\n"); 위 코드랑 같음, but 보통은 위처럼 사용
		System.out.printf("나이:%d\n", 27); // %d 의미 : decimal(10진수)
		System.out.printf("신장:%f\n", 186.5);
		System.out.printf("신장:%e\n\n", 186.5); // 지수로 표현
		
		
		
		//이렇게 문법이 복잡한 이유
		System.out.println("[이름:" + "김자바" + "], " + "[나이:" + 27 + "]");
		System.out.printf("[이름:%s], [나이:%d]", "김자바",27);
		System.out.print("\n\n");
		
		// 이렇게 두 줄은 같은 출력값을 같는다. 
		// 첫째 코드는 보기가 너무 불편하다.
		// 하물며 코드가 더 복잡해진다면 더더욱 알아보기가 힘들것이다.
		// 그래서 이런 문법을 통해 더 편하게 보기위해 이 문법을 사용
		
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n\n", value);
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %f\n", 10 , area);
		System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", 10 , area);
		System.out.printf("반지름이 %d인 원의 넓이: %03.2f\n", 10 , area);

	}
}
