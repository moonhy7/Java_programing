package ch07_2_polymorphism;

public class Parent {
	// 필드
	String p_str = "parent String...";
	// 메소드
	void print() {
		System.out.println(p_str);
	}
}

class Child extends Parent {
	//필드
	String c_str = "Child String...";
	//생성자
	
	//메소드
	@Override 
	void print() {
		display();
	}
	
	void display() {
		System.out.println('♥');
	}
	
	public class ChildExample {
//		public static void main(String[] args) {
//			child c = new child();
//			c.print();
//		}
	}
}