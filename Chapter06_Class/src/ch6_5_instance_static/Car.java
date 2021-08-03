package ch6_5_instance_static;

//static double pi = 3.141592; // 이렇게 하면 에러남

public class Car {
	public static void main(String[] args) {
		A a = new A();
		a.name = "하하";
//		a.//pi 안뜸 -> 왜? static 을 붙였기때문에
	}
}

class A {
	static double pi = 3.141592;
	String name;
}
