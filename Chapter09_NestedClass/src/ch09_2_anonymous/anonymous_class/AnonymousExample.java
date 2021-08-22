package ch09_2_anonymous.anonymous_class;

public class AnonymousExample {
	public static void main(String[] args) {
		// 객체 부터 생성
		Anonymous anony = new Anonymous();
		
		// 방법 1 사용. 필드 사용
		anony.field.wake(); // 6시에 일어납니다. 출근합니다.

		
		// 방법 2 사용. 로컬 변수 사용
		anony.method1(); // 7시에 일어납니다. 산책합니다.
		
		
		// 방법 3 사용. 매개변수로 대입하여 사용
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}				
			}
		); // 8시에 일어납니다. 공부합니다.
	}
}
