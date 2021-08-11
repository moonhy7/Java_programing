package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) { 
		
		// try-catch�� ���δ��� throw�� ���ܴ������� �϶�� ���� ���� ����
		
		try {
			System.out.println("add: " + Calculator.add(10000,-2));
			System.out.println("div: " + Calculator.div(10000,0));
			System.out.println("add: " + Calculator.add(1,-2));
		
		} catch (BizThousandOverException e) {
			e.printStackTrace();
//			System.out.println("������� õ�� �ѽ��ϴ�. Ȯ�� ���!");
			
		} catch (BizNagativeNumberException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
//			System.out.println("������� �����Դϴ�. Ȯ�� ���!");
		} catch (BizDivedByZeroException e) {
			System.out.println(e.toString());
//			System.out.println("0���� ���� �� �����ϴ�. Ȯ�� ���!");
		}
		
		
		// ������ �������� ��� �鸮�°�
		finally {
			System.out.println("�Է°��� Ȯ���ϼ���~");
		}
		System.out.println("���α׷� ���� ����");

		
		// Add throws declaration �� �����ϸ� �� ������ ����
		// �׷��� main �޼ҵ�� ���� ���ܱ��� �� ����ΰǵ� ���⼭���� ���������� JVM���� ���ѱ�� �Ǵ°���/
		// �׷��� �ϸ� �ȵȴ�. 
		// Surround with try/catch �� Ŭ�����־���Ѵ�.
		
		
//		System.out.println("sub: " + Calculator.sub(5,3));
//		System.out.println("multi: " + Calculator.multi(1,3));
//		
//		
//		try {
//			System.out.println("div: " + Calculator.div(1,1));
//		} catch (BizDivedByZeroException e) {
//			e.printStackTrace();
//		}	
		
		
	}
}
