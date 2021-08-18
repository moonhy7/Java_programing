package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		/** [HashSet] implements Set
		 * 
		 * List컬렉션(인터페이스)은 객체의 순서를 유지하지만,
		 * - Set 컬렉션(인터페이스)는 저장 순서가 유지되지 않는다.
		 * - 인덱스로 관리 되지 않는다.
		 * 	 : 반복자(Iterator) 제공한다.
		 * 	 중복해서 저장할 수 없는 수학의 집합 개념
		 * 
		 */
		
		Set<String> set = new HashSet<>();
		
		// HashCode() + equal()
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		
		// 동일 객체 저장
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// 반복자를 이용한 루핑
		Iterator<String> itr = set.iterator(); // 해당 자료구조의 반복자 얻기
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("\t" + str);
		}
		System.out.println();
		
		// set.remove("JDBC");
		// set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		System.out.println("======================================");
		
		// 반복자 다시 얻기(초기화)
		 itr = set.iterator(); //
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("\t" + str);
		}
		
		itr = set.iterator(); // 초기화 하는 습관!!!
		System.out.println("======================================");
		
		
		// for문 루핑
		for(String e : set) {
			System.out.println("\t" + e);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음(" + set.size() + ")");
		}	
	}
}
