package ch13_1_collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		/** [ArrayList] implements List
		 * 
		 * - �˻�(�ε����� �ٷ� ����)�� �迭 �� �� ���� �� ����
		 * - ���� ��ü�� ���� �߰�/������ ����� ��� �Ҹ�
		 */
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servelet/JSP");
		System.out.println(list);
		
		list.add(2, "Database");
		System.out.println(list);
		
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println(list);
		System.out.println("�� ��ü��: " + size);
		System.out.println("------------------------------------------");
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.remove("iBATIS");		
		System.out.println(list);
		System.out.println("�� ��ü��: " + size);
		
	}
}
