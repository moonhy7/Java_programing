package Exercise.ch07.sec2;

class A {} // ����

class B extends A {} // B = A�� �ڽ�
class C extends A {} // C = A�� �ڽ�

class D extends B {} // D = B�� �ڽ�, A�� ����
class E extends C {} // E = C�� �ڽ�, A�� ����

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B(); 
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ
		A a2 = c; // �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ
		A a3 = d; // ���θ� Ÿ������ �ڵ� Ÿ�� ��ȯ
		A a4 = e; // ���θ� Ÿ������ �ڵ� Ÿ�� ��ȯ
		
		B b1 = d; // �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ
		C c1 = e; // �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ
		
		// B b2 = e; // B�� E�� ��� ���迡 ���� �����Ƿ� ���� �߻�
		// C c2 = d; // C�� D�� ��� ���迡 ���� �����Ƿ� ���� �߻�
	}
}
