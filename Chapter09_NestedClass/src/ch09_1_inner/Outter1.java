package ch09_1_inner;

public class Outter1 { // �ڹ� 8 ���� ���ʹ� final ���� ���� (�˾Ƽ� final Ư���� ����)
	public void method1(final int arg) { // �޼ҵ� ������
		final int localVariable = 1; // ���� ������ �Ű������� final�� ����
		// arg = 100; // ������ ���� �߻�
		// localVariable = 100; // ������ ���� �߻�
		// ���� ���� : The final local variable cannot be assigned.
		
		class Inner { // ���� Ŭ���� 
			public void method() {
				int result = arg + localVariable; // ���� Ŭ���� ���ο��� ���� ������ �Ű����� ��� 
			}
		}
	}
}
