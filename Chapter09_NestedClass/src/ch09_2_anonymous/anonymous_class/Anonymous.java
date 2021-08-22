package ch09_2_anonymous.anonymous_class;

// 부모 클래스 생성
class Person {
	void wake() {
		System.out.println("6시에 일어납니다.");
	}
}


// 익명 자식 객체 생성할 클래스 생성
public class Anonymous {
		
		// 방법 1. 필드의 초기값으로 대입
		Person field = new Person() {
			void work() {
				System.out.println("출근합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("6시에 일어납니다.");
				work();
			}
		};
		
		// 방법 2. 로컬 변수로 대입
		void method1() {	
			//로컬 변수 생성
			Person localVar = new Person() {
				void walk() {
					System.out.println("산책합니다.");
				}
				
				@Override
				void wake() {
					System.out.println("7시에 일어납니다.");
					walk();
				}
			};
			// 로컬 변수 사용
			localVar.wake();
		}
		
		// 방법 3. 매개 값으로 대입
		void method2(Person person) {
			person.wake();
		}
}
