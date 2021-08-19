package ch09_1_inner;

class Outter { // �ٱ� Ŭ����
	String field = "Outter-field"; // �ٱ� Ŭ���� �ʵ� ����
	void method() { // �ٱ� Ŭ���� �޼ҵ� ����
		System.out.println("Outter-method");
	}

	class Nested { // ��ø Ŭ����
		String field = "Nested-field"; // ��ø Ŭ���� �ʵ� ����
		void method() { // ��ø Ŭ���� �޼ҵ� ����
			System.out.println("Nested-method");
		}

		void print() { // ��ø Ŭ���� ���ο��� print() �޼ҵ� ����
			
			// ��ø Ŭ���� ���ο��� ��ø Ŭ���� �ڽ��� �ʵ�� �޼ҵ� ���
			System.out.println(this.field); // �׳� this�� ���
			this.method();

			// ��ø Ŭ���� ���ο��� �ٱ� Ŭ���� �ʵ�� �޼ҵ� ���
			System.out.println(Outter.this.field); // �ٱ�Ŭ������.this ���
			Outter.this.method();
		}
	}
}

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter(); // �ٱ� Ŭ������ ��ü ����
		Outter.Nested nested = outter.new Nested(); // ��ø Ŭ���� ��ü ����
		nested.print(); // ��ø Ŭ���� �޼ҵ� ����
	}
}
