package ch06_5_instance_static;

//static double pi = 3.141592; // �̷��� �ϸ� ������

public class Car2 {
	public static void main(String[] args) {
		A a = new A();
		a.name = "����";
//		a.pi; // �ȶ� -> ��? static �� �ٿ��⶧����
		double num = A.pi; // �̰� ������ (���°� Ŭ������.�ʵ��) 
	}
}

class A {
	static double pi = 3.141592;
	String name;
}
