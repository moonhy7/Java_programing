package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
//		[변수에 할당된 값 스와핑]
		int x = 3;
		int y = 5;
//		x = 3, y = 5
		
		System.out.println("x:" + x + ", y:" + y);
//		x:3, y:5
		
//		아래처럼 하면 안됨. 3이 사라짐. 제3의 변수 temp가 필요한 이유임
//		x = y;	// x : 5
//		y = x;	// y : 5
		
		int temp = x;	// 3
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		System.out.println();
		
//		[변수에 할당된 값 스와핑 다시 해보기 (안되는 예시)]
		int a = 100;
		int b = 200;
//		a = 100, b = 200
		System.out.println("a의 값: " + a);
		System.out.println("b의 값: " + b);
		
		a = b;
		System.out.println("a=b, a의 값: " + a);
		System.out.println("a=b, b의 값: " + b);

		b = a;
		System.out.println("b=a, a의 값: " + a);
		System.out.println("b=a, b의 값: " + b);
		
//		[변수에 할당된 값 스와핑 다시 해보기 (잘되는 예시)]
		int c = 100;
		int d = 200;
		int temp2;
//		c = 100, d = 200
		
		temp2 = c;	// 100
		
		c = d; // 200
		System.out.println("c의 값: " + c);
		System.out.println("d의 값: " + d);
		
		d = temp2;	// temp2 = 100
		System.out.println("c=d, c의 값: " + c);
		System.out.println("c=d, d의 값: " + d);
		
//		c:3, d:5
		System.out.println("c="+ c + ", d=" + d);

		
	}
}
