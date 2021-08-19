package ch09_1_inner;

class Outter { // 바깥 클래스
	String field = "Outter-field"; // 바깥 클래스 필드 선언
	void method() { // 바깥 클래스 메소드 선언
		System.out.println("Outter-method");
	}

	class Nested { // 중첩 클래스
		String field = "Nested-field"; // 중첩 클래스 필드 선언
		void method() { // 중첩 클래스 메소드 선언
			System.out.println("Nested-method");
		}

		void print() { // 중첩 클래스 내부에서 print() 메소드 선언
			
			// 중첩 클래스 내부에서 중첩 클래스 자신의 필드와 메소드 사용
			System.out.println(this.field); // 그냥 this만 사용
			this.method();

			// 중첩 클래스 내부에서 바깥 클래스 필드와 메소드 사용
			System.out.println(Outter.this.field); // 바깥클래스명.this 사용
			Outter.this.method();
		}
	}
}

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter(); // 바깥 클래스의 객체 생성
		Outter.Nested nested = outter.new Nested(); // 중첩 클래스 객체 생성
		nested.print(); // 중첩 클래스 메소드 선언
	}
}
