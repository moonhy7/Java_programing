package Exercise.ch07.sec1.pack1;

public class B {
	public static void main(String[] args) {
		A a = new A(); // 생성자에 접근 가능 (객체 생성)
		a.field = "value"; // 필드에 접근가능 (필드 값 변경)
		a.methode(); // 메소드 실행 가능
	}
}
