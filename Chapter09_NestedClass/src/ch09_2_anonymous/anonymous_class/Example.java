package ch09_2_anonymous.anonymous_class;

class Parent {
	void parentMethod() {}
} // 부모 클래스 생성

class Child extends Parent {} // 자식 클래스 생성

// · 상속을 통해 객체 생성 - 명시적인 방법
public class Example {
	
	// 필드의 초기값으로 자식 객체를 대입
	Parent field = new Child();
	
	// 로컬 변수로 자식 객체를 대입
	void method() {
		Parent localVar = new Child();
	}
}

// 상속을 통해 객체 생성 - 익명 객체를 사용하는 방법

class Example2 {
	// 방법 1. 필드 선언
	Parent field = new Parent() { // 부모 생성자를 호출하는 코드
	    // 부모 클래스를 상속해서 중괄호 안에 있는 내용처럼 자식 클래스를 선언한다는 의미
		int childField; // 필드나 메소드선언
		void childMethod() {}
		@Override // 부모 메소드를 재정의
		void parentMethod() {
			childField = 3; // 익명 자식 객체에서 정의된 필드와 메소드는
			childMethod(); // 익명 자식 객체 안에서만 사용 가능함
		} // 이유는 익명 자식 객체가 부모 타입 변수에 대입되어 부모 타입에 선언된것만 사용 가능하기 때문
	};
	
	void method_cannot_use_anonymous() {
		// field.childField = 3; // 익명 자식 객체 외부에서는 필드나 메소드 사용 불가
		// field.childMethod(); // parentMethod() 내부에서는 사용 가능
		field.parentMethod(); // 부모 메소드 호출은 가능
	}
		
	// 방법 2. 로컬 변수 선언 (방법1과 차이점은 메소드안에서 생성한다는 것만 다름)
	void method() {
		Parent localVar = new Parent() { 
			int childField;
			void childMethod() {}
			@Override
			void parentMethod() {} // 부모 메소드를 재정의
		};
	}
	
	// 방법 3. 매개 값으로 익명 객체 대입
	void method1(Parent parent) {} // 매개변수를 갖는 메소드 선언
	void method2() { // method1()을 호출
		method1( // method1()의 매개 값으로 익명 객체 대입
			new Parent() {
				int childField;
				void childMethod() {}
				@Override
				void parentMethod() {}
			}	
		);		
	}
}

