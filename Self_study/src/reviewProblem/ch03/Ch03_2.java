package reviewProblem.ch03;

import java.util.Scanner;

public class Ch03_2 {
	public static void main(String[] args) {
		//1��
		byte b = 5;
//		b = -b; ����//��ȣ����� int������, byte�� �����
		
		//5��
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = (double)var1 / var2; // 2.5
//		int var4 = (int)(var3 * var2); // 5
//		
//		//6��
//		int value = 356;
//		System.out.println((value/100)*100);
//		
		//7��
//		float var1 = 10f; // 10.0
//		System.out.println(var1); 
//		float var2 = var1/100; 
//		System.out.println(var2); // 0.1
//		System.out.println((double)var2); // 0.10000000149011612
//		System.out.println();
//		
		// 9��
		
//		Scanner scn = new Scanner(System.in);
//		System.out.print("ù ��° ��: ");
//		double x = Double.parseDouble(scn.next());
//		System.out.print("�� ��° ��: ");
//		double y = Double.parseDouble(scn.next());
//		if(y==0 && y==0.0) {
//			System.out.println("���: ���Ѵ�");
//		} else {
//			System.out.println("���: " + (double)x/y);
//		}
		
		// 10��
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double pi = Double.parseDouble(var2 + "."+var3);
		double var4 = var1 *var1*Double.parseDouble(var2 + "."+var3);
		System.out.println("���� ����:" + var4); // ���� ����:314.0
		
		
		//11��
		Scanner scn = new Scanner(System.in);
		
		System.out.print("���̵�:");
		String name = scn.nextLine();
		
		System.out.print("�н�����:");
		String strPassword = scn.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) { // name == "java" �ϸ� Ʋ��!
			if(password == 12345) {
				System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����: �н����尡 Ʋ��");
		}
	} else {
		System.out.println("�α��� ����: ���̵� �������� ����");
	}
		
		
		
		
	
		
	}
	
}
