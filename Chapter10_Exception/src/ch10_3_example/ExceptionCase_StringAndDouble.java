package ch10_3_example;

import java.util.InputMismatchException; // util�� �ִ°� import �ʼ�
import java.util.Scanner; // but, lang�� �ִ°� �׳� �� �� ����

public class ExceptionCase_StringAndDouble {
	public static void main(String[] args) {
		// �� ������ ����ڷκ��� �Է¹ޱ� ��) 3,4 3/4 ������ �����ϰ�
		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		// ���� ���°� �� �� Ŭ���ϸ� ��� ���ܳ����� �˷���
		// �� �ڵ带 catch������ �־���

		try {
			System.out.print("a / b �Ŀ� ���� a ���� �Է��ϼ��� > ");
			double n1 = sc.nextDouble();
			
			System.out.print("a / b �Ŀ� ���� b ���� �Է��ϼ��� > ");
			double n2 = sc.nextDouble();
			
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


