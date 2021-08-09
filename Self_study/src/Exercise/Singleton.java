package Exercise;

public class Singleton {
	// 정적 필드
	// 타입이 자기자신(클래스)인 정적 필드 선언하고 객체 생성하여 초기화 
	private static Singleton singleton = new Singleton();
	
	// 생성자
	// 다른 클래스에서 객체를 추가로 생성하지 못하도록 private을 붙임
	private Singleton() {}
	
	// 정적 메소드
	// 타입이 클래스 자기 자신이고 return값으로는 참조하고 있는 자신의 객체를 리턴해준다.
	static Singleton getInstance() {
		return singleton;
	}
 }
