package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/** [HashMap] implements Map
		 * 
		 * 키(key)객체, 값(Value)객체로 구성된 Map, Entry 객체를 저장하는 구조
		 * 	: Entry는 Map 인터페이스 내부에 선언된 중첩 인터ㅠㅔ이스
		 * 
		 * - 키(key)는 중복 저장될 수 없지만 값은 중복 저장 가능
		 */
		// 이름과 정수를 저장하는 자료구조
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("신용권", new Integer(85));
		map.put("홍길동", 90);
		map.put("장길산", 90);
		
		// 키가 같으므로 마지막 저장 값으로 대체
		map.put("홍길동", 65);
		System.out.println("총 Entry 수: " + map.size());
		System.out.println(map);
		
		// [객체 찾기 : 키 값으로 값 가져오기]
		System.out.println("홍길동: " + map.get("홍길동"));
		// [키 검색]
		System.out.println("Key존재 여부: " + map.containsKey("장길산"));
		System.out.println("=======================================");
		
		// [객체 루핑 및 처리]
		
		// 1. Set<Key> 이용
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer iv = map.get(key);
			System.out.printf("key: %s, Value: %d\n", key, iv);
		}
		itr = keys.iterator();
		System.out.println("=====================================");
		
		
		// 2. Set<Map.Entry> 이용
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
