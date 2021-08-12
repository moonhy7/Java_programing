package bitcamp.common;

public class Calculator { // ���� ��ƿ, ������ �� �� �ִ� ���̺귯�� �ڵ���
	
	// ���������� x + y ���� 1,000�� ������ ���� �߻�
	// ���������� x + y ���� �����̸� ���� �߻�
	public static int add(int x, int y) throws BizThousandOverException, BizNegativeNumberException  {
		int result = x + y;
		if(result >1_000) {
			throw new BizThousandOverException(); // ���� ��ü�� ������.
		}
		if(result < 0) {
			throw new BizNegativeNumberException(); // ���ܰ�ü�� ���� �� ���� �� ����
		}
		return result;
	}
	
	// ���������� x - y ���� �����̸� ���� �߻�
	public static int sub(int x, int y) throws BizNegativeNumberException {
		int result = x - y;
		if(result < 0) {
			throw new BizNegativeNumberException();
			}
		return result;
	}
	
	public static int multi(int x, int y) {
		int result = x * y;
		return result;
	}
	
	// ���������� y�� ���� 0�̸� ���� �߻�
	public static int div(int x, int y) throws BizDivedByZeroException {
		
		if(y==0) {
			throw new BizDivedByZeroException();
		}
		int result = x / y;
		return result;
	}
}