package ch10_1_exception_class;

public class NullPointerExceptionExample {
	// 필드
	int x;
	int y;
	boolean b;
	Person p; // Null로 초기화됨 
	
	// main 메소드
	public static void main(String[] args) {
		String data = null;
		
		try {
			method();
			 // 아래 코드는 null 값을 가진 객체에  접근을 시도했기 때문에 에러 발생
			System.out.println(data.toString());
			System.out.println(data.length());

		} catch(NullPointerException e) {
			System.out.println("예외 발생");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외 발생 코드 실행!");
		}
		System.out.println("프로그램 종료");
	}
	
	// 메소드 선언
	private static void method() {}
}
