package homework;

import java.io.IOException;

public class LogicalOperatorHW {
	public static void main(String[] args) throws IOException {
		// ch03_2_operator_LogicalOperatorExample ���� ����
		// ���� : ���ڸ� �Է¹޾Ƽ� �ϴ� �ɷ� ����
		
		int str;
		System.out.println("�ϳ��� ���ڸ� �Է��Ͻÿ� = ");
		str = (int)System.in.read();

		System.out.println(str);
		
		if ((str>=65) & (str<=90)) {
			System.out.println("�빮�ڱ���");
		}
		
		if ((str>=97) && (str<=122)) {
			System.out.println("�ҹ��ڱ���");
		}
		
		if (!(str<48) && !(str>57)) {
			System.out.println("0~9 ���ڱ���");
		}
		
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}
		
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}
	}
}

