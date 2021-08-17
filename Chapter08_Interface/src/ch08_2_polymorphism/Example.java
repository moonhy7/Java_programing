package ch08_2_polymorphism;

// 상위 인터페이스 2개 
interface InterfaceA {
	public void methodA();
 }

interface InterfaceB {
	public void methodB();
}

//하위 인터페이스
interface InterfaceC extends InterfaceA, InterfaceB {
	public void methodC();
}

// 하위 인터페이스 구현
class ImplementationC implements InterfaceC {
	public void methodA() { // InterfaceC와 그 위에 있는 모든 상위 인터페이스들의 실체 메소드들도 있어야함
		System.out.println("ImplementationC-methodA() 실행");
	}
	
	public void methodB() {
			System.out.println("ImplementationC-methodB() 실행");
		}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}

// 실행 클래스
public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC(); 
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println(); // methodA()만 호출 가능
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println(); // methodB()만 호출 가능
		
		InterfaceC ic = impl;
		ic.methodA();	// InterfaceC 변수는  세 메소드 모두 호출 가능
		ic.methodB();
		ic.methodC();	
	}
}
