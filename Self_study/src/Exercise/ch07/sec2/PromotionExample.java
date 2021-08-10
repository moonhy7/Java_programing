package Exercise.ch07.sec2;

class A {} // 조상

class B extends A {} // B = A의 자식
class C extends A {} // C = A의 자식

class D extends B {} // D = B의 자식, A의 손자
class E extends C {} // E = C의 자식, A의 손자

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B(); 
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // 부모 타입으로 자동 타입 변환
		A a2 = c; // 부모 타입으로 자동 타입 변환
		A a3 = d; // 조부모 타입으로 자동 타입 변환
		A a4 = e; // 조부모 타입으로 자동 타입 변환
		
		B b1 = d; // 부모 타입으로 자동 타입 변환
		C c1 = e; // 부모 타입으로 자동 타입 변환
		
		// B b2 = e; // B와 E는 상속 관계에 있지 않으므로 에러 발생
		// C c2 = d; // C와 D는 상속 관계에 있지 않으므로 에러 발생
	}
}
