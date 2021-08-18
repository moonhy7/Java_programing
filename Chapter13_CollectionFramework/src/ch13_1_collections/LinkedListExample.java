package ch13_1_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	static final int DELAY = 100;
	public static void main(String[] args) {
		/**
		 * [LinkeList] implements List
		 * 
		 * - ArrayList�� ���� �迭�� ��ü�� �����ؼ� ����������
		 * - LinkedList�� ���� ������ ��ũ�ؼ� ü��ó�� ����
		 * - Ư�� �ε����� ��ü�� ����/���� �� �� �� ��ũ�� ����ǰ�
		 * 	  ������ �ʵ�� �Һ�(�迭���� ���ʿ�)
		 * 	  ���� ���������� (����������) �߰�/�����ϴ� ��� ArrayList�� ������
		 *	  �߰��� �߰�/���� �� ��� LinkedList�� �� ������. 
		 */
	
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<DELAY; i++) {
			list1.add(0, Integer.toString(i));
		}
			
		endTime = System.nanoTime();
		System.out.printf("ArrayList �ɸ��ð�: %5d ns\n", endTime - startTime);

		startTime = System.nanoTime();
		for(int i=0; i<DELAY; i++) {
			list2.add(0, Integer.toString(i));
		}
		
		endTime = System.nanoTime();
		System.out.printf("ArrayList �ɸ��ð�: %5d ns\n", endTime -startTime);
		
	}
}
