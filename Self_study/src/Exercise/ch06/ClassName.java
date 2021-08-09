package Exercise.ch06;

public class ClassName {
	
	// 인스턴스 멤버 선언
	int field1;
	void method1() {};
	
	// 정적 멤버 선언
	static int field2;
	static void method2() {};
	
	// 정적 메소드 안에서 필드와 메소드 사용
	static void method3() {
//		this.field1 = 10; //인스턴스 필드를 this 연산자로 접근시 컴파일에러
//		this.method1(); //인스턴스 메소드를 this 연산자로 접근시 컴파일에러
		field2 = 10; //정적 필드는 그냥 사용할 수 있음
		method2(); //정적 메소드도 그냥 사용할 수 있음
		
		ClassName obj = new ClassName(); // 인스턴스 멤버 사용을 위해 먼저 객체를 생성
		obj.field1 = 10; // 인스턴스 필드를 사용하기 위해 참조 변수로 접근
		obj.method1(); // 인스턴스 메소드를 사용하기 위해 참조 변수로 접근
	}
}
