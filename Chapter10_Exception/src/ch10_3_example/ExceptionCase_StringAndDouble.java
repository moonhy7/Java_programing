package ch10_3_example;

// java.lang�� �ִ°� �׳� �� �� ������ java.util�� �ִ°� import �ʼ���
import java.util.InputMismatchException;
import java.util.Scanner; 

public class ExceptionCase_StringAndDouble {
	public static void main(String[] args) {
		// �� ������ ����ڷκ��� �Է¹ޱ� ��) 3,4 3/4 ������ �����ϰ�
		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		// ���� ��� ��� Ŭ���ϸ� ���° ���ο��� ���ܰ� �߻��Ѱ��� �˷��ش�.
		// �� �ڵ�� ���� �߻� ���ɼ��� �ִ� �ڵ��̹Ƿ� catch ������ �־��ش�.
		
		try {
			System.out.print("a / b �Ŀ� ���� a ���� �Է��ϼ��� > ");
			double n1 = sc.nextDouble();
			
			System.out.print("a / b �Ŀ� ���� b ���� �Է��ϼ��� > ");
			double n2 = sc.nextDouble();
			
			if(Double.isInfinite(n1/n2)) {
				throw new ArithmeticException(); 
				// infinity�� ������ ���� �ذ� - ���ܷ� ����ϰ�ʹٸ� �� ���� ��ü�� throw �ϱ�
			}
			
			System.out.printf("%f / %f = %f\n", n1, n2, (double)n1/n2);
		
		} catch(InputMismatchException e) {
			System.out.println("���ڿ��� ���� �� �����ϴ�.");
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			System.out.println("���α׷� ����");
		}
		
	}
}


