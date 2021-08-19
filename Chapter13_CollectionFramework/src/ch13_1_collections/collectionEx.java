package ch13_1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

//class MyClass {}

public class collectionEx {
	public static void main(String[] args) {
		
		// ���� �����ϴ� �迭
		int[] arr1 = new int[3];
		arr1[0] = 1;
		// arr1[3] = 3;
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
	
		// ������ �����ϴ� �迭
		MyClass[] arr2 = new MyClass[3];
		arr2[0] = new MyClass();
		System.out.println(Arrays.toString(arr2));
		
		// �迭�� �Ѱ�...
		
		// Collection �ڷᱸ�� ����
		
		// add(1)
		// add("korea");
		// remove(3); // �̷��� ���ϴ� �޼ҵ带 �ٷ� �ҷ����� �� �� �ֵ��� �÷��� ������ �ʿ��ϴ�.
		
		// Collection �ڷᱸ�� ����
		List<String> list1 = new ArrayList<>();
		list1.add("kor");
		list1.add("1");
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(new Integer(1));
		list2.add(1); // ����ڽ�
		System.out.println(list2.get(1));
		System.out.println(list2);
		
		List<Character> list3 = new Vector<>();
		list3.add('e'); list3.add('f'); 
		System.out.println(list3);
		
		List<Float> list4 = new LinkedList<>();
		list4.add(0.1f); list4.add(1.1f);
		System.out.println(list4);

		List<Double> list5 = new LinkedList<>();
		list5.add(0.1);
		list5.add(0.1);
		list5.add(0.1);
		System.out.println(list5);
		
		Set<Double> set = new HashSet<>();
		set.add(0.1);
		set.add(0.1);
		set.add(0.1);
		System.out.println(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(211, "����");
		map.put(201, "����");
		System.out.println(map);
	}
}
