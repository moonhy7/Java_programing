package ch13_1_collections;

import java.util.Arrays;

public class MyCollectionTest1 {
	public static void main(String[] args) {
		int[] list = new int[3];
		
		list[0] = 1;
		list[1] = 3;
		list[2] = 5;
		
		System.out.println(list[2]);
		System.out.println(list.length);
		System.out.println(Arrays.toString(list));
		
		// list[3] = 7; �߰�? ArrayIndexOutOfBoundsException
		// �迭 ���� �ʿ�
		// list[3] = 7;
		
		// list[1] ����?
		// �迭 ���� �ʿ�
		int[] temp = new int[2];
		temp[0] = list[0];
		temp[1] = list[2];
		
		list = temp;
		System.out.println(Arrays.toString(list));
		
		/*
		 * list.add(1)
		 * list.add(3)
		 * list.add(5)
		 * 
		 * list.add(7); �˾Ƽ� �÷� �ְ�
		 * list.remove(2); �˾Ƽ� ������ �ְ�
		 * 
		 * list.toString(); �迭 ��֤� ����ְ�
		 * 
		 * �̷� �ڷ� Ÿ���� ������ �����ٵ�...........TT;;
		 */
	}
}
