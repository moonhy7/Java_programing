package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A { // 상속
	public D() {
		super();
		this.field = "value"; // A 클래스의 필드 사용
		this.method(); // A 클래스의 메소드 사용
	}
}
