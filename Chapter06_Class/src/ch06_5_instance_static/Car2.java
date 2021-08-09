package ch06_5_instance_static;

//static double pi = 3.141592; // 이렇게 하면 에러남

public class Car2 {
	public static void main(String[] args) {
		A a = new A();
		a.name = "하하";
//		a.pi; // 안뜸 -> 왜? static 을 붙였기때문에
		double num = A.pi; // 이건 가능함 (형태가 클래스명.필드라서) 
	}
}

class A {
	static double pi = 3.141592;
	String name;
}
