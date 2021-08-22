package ch09_2_anonymous.localVariance_final;

interface Calculatable { // �������̽� ����
	int sum(); // �߻� �޼ҵ� ����
}

public class Anonymous {
	int field; // �ʵ� ���� (������ ���� ����) 
	
	public void method(final int arg1, int arg2) { 
		// �޼ҵ� ���ο��� ����� �Ű������� ���� �������� ��� ������ �Ұ���
		// ���� final Ư���� ���Ѵ�.
		final int var1 = 40;
		int var2 = 50; 
		
		field = 10;
		
		// arg1 = 20; // final�� �ٿ���
		// arg2 = 20; // final�� �Ⱥٿ��� �Ѵ� �� ������ �Ұ����ϴ�. 
		
		// var1 = 30; // final�� �ٿ���
		// var2 = 30; // final�� �Ⱥٿ��� �Ѵ� �� ������ �Ұ����ϴ�.
		
		// ���� �� ������ �õ��Ѵٸ� �Ʒ� sum() �޼ҵ� ��� �Ŀ��� ������ ���� �߻���
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
