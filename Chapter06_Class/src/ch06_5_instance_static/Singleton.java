package ch06_5_instance_static;

public class Singleton {

	//스태틱 필드
	private static Singleton ref = new Singleton();
	
	//private 생성자
	//생성자 호출 안되도록..
	private Singleton() {}
	
	//스태틱 메소드
	static Singleton getInstance() {
		return ref;
	}
}