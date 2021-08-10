package Exercise.ch06.exam04;

import Exercise.ch06.exam03.AA;

public class CC {
	public CC() {
		AA a = new AA();
		a.field1 = 1;
//		a.field2 = 1; // default 필드 접근 불가
//		a.field3 = 1; // private 필드 접근 불가
		
		a.method1();
//		a.method2(); // default 필드 접근 불가
//		a.method3(); // private 필드 접근 불가
	}
}


