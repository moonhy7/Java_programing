package ch07_1_inheritance;

public class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areacircle() ����");
		return super.areaCircle(r) * 1_000;
	
//		A a1 = new A();
//		a1.
	}	
}

class A extends Object {
	
}
