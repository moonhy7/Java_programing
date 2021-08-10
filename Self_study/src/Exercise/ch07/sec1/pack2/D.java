package Exercise.ch07.sec1.pack2;

import Exercise.ch07.sec1.pack1.A;

public class D extends A{
	// 자식 클래스 생성자
	public D() {
		// A a = new A(); // new 연산자를 통해 생성자 직접 호출은 불가능하다
		super(); // supe()로 A생성자 호출 가능
		this.field = "value"; // 다른 패키지지만 D가 A의 자식이므로 필드에 접근 가능
		this.methode(); // 다른 패키지지만 D가 A의 자식이므로 메소드에 접근 가능
	}
}
