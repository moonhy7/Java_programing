package ch07_2_polymorphism;

public class Parent {
	// �ʵ�
	String p_str = "parent String...";
	// �޼ҵ�
	void print() {
		System.out.println(p_str);
	}
}

class Child extends Parent {
	//�ʵ�
	String c_str = "Child String...";
	//������
	
	//�޼ҵ�
	@Override 
	void print() {
		display();
	}
	
	void display() {
		System.out.println('��');
	}
	
	public class ChildExample {
//		public static void main(String[] args) {
//			child c = new child();
//			c.print();
//		}
	}
}