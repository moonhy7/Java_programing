package Exercise.ch07.sec2;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child(); 
		
		Parent parent = child; // 자동 타입 변환
		parent.method1(); // Parent-method1()
		parent.method2(); // 재정의된 메소드가 호출됨 -> Child-method2() 출력
		// parent.method3(); // 호출 불가능
	}
}
