package ch09_1_inner;

public class A2 {
	
	//인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	
	class B2 {	// 인스턴스 멤버 클래스라서 모든 필드와 메소드에 접근 가능하다
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;	
			method2();
		}
	}
	
	static class C {	// 정적 멤버 클래스라서 정적 필드와 메소드만 접근이 가능하다.
		void method() { 
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
