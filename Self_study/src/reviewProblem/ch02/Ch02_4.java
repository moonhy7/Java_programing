package reviewProblem.ch02;

import java.util.Scanner;

public class Ch02_4 {
	public static void main(String[] args) {
		//	break point ?
//		������ϴ�����: �α׸� ���ܾ���
//		��Ŭ������ ������? ������Ϸ���?
//		������ syso i,j �����
//		��� ���������� �α׸� ��� ���� ���� ���� , �⺻ ���̺귯�� �����ϹǷ� �װ��� �̿�
	
		
		// Ȯ�ι��� 1��
		String name1 = "���ڹ�";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.println("�̸�: " + name1);
		System.out.print("����: " + age + "\n");
		System.out.printf("��ȭ: %s-%s-%s",tel1,tel2,tel3);
		
		
/*		Ȯ�ι��� 2��
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��°��: ");
		String strNum1 = scanner.nextLine();
		System.out.print("�ι�°��: ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("���� ���: " + result);
*/		
		
		
		
		
		
//		Ȯ�ι��� 3��
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: ");
		String name = scn.nextLine();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String registNum = scn.nextLine();
		System.out.print("3. ��ȭ��ȣ: ");
		String phoneNum = scn.nextLine();
		
		System.out.println("\n[�Է��� ����]");
		System.out.println(name);
		System.out.println(registNum);
		System.out.println(phoneNum);
		

		
		
		
	}
}
