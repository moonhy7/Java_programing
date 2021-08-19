package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/** [HashMap] implements Map
		 * 
		 * Ű(key)��ü, ��(Value)��ü�� ������ Map, Entry ��ü�� �����ϴ� ����
		 * 	: Entry�� Map �������̽� ���ο� ����� ��ø ���ͤФ��̽�
		 * 
		 * - Ű(key)�� �ߺ� ����� �� ������ ���� �ߺ� ���� ����
		 */
		// �̸��� ������ �����ϴ� �ڷᱸ��
		Map<String, Integer> map = new HashMap<>();
		
		// ��ü ����
		map.put("�ſ��", new Integer(85));
		map.put("ȫ�浿", 90);
		map.put("����", 90);
		
		// Ű�� �����Ƿ� ������ ���� ������ ��ü
		map.put("ȫ�浿", 65);
		System.out.println("�� Entry ��: " + map.size());
		System.out.println(map);
		
		// [��ü ã�� : Ű ������ �� ��������]
		System.out.println("ȫ�浿: " + map.get("ȫ�浿"));
		// [Ű �˻�]
		System.out.println("Key���� ����: " + map.containsKey("����"));
		System.out.println("=======================================");
		
		// [��ü ���� �� ó��]
		
		// 1. Set<Key> �̿�
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer iv = map.get(key);
			System.out.printf("key: %s, Value: %d\n", key, iv);
		}
		itr = keys.iterator();
		System.out.println("=====================================");
		
		
		// 2. Set<Map.Entry> �̿�
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> eitr = entrySet.iterator();
		while(eitr.hasNext()) {
			String key = entry.getKey();
			Integer iv = entry.getValue;
			System.out.printf("key: %s, Value: %d\n", key, iv);
		}
		eitr = entrySet.iterator();
		System.out.println("=====================================");
		
		
		
	
	}
}
