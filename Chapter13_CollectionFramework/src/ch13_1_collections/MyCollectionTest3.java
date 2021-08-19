package ch13_1_collections;

import com.libs.collection.MyList;
import com.libs.collection.MySmartList;
import com.libs.collection.MyIntList;

class MyClass {
	
}


public class MyCollectionTest3 {
	public static void main(String[] args) {
		
		MyList<String> list = new MySmartList<String>(); 
		
		list.add("1");
		list.add("3"); 
		list.add("♥");

		System.out.println(list);
//		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		list.add("kor");
		list.add("홍길동");
		list.add("a");
		
		MyList<Integer> list2 = new MySmartList<>();
		list2.add(new Integer(100)); 
		list2.add(300); // Auto Boxing
		
		System.out.println(list2);
//		System.out.println("list[2]의 값: " + list2.get(2));
		System.out.println("size: " + list2.size());
		System.out.println("======================================");
		
		MyList<Object> list3 = new MySmartList<>();
		list3.add("Hello");
		list3.add(11);
		list3.add(3.14f);
		list3.add('A'); // Auto Boxing[new Character('A')]
		list3.add(new MyClass());
		
		
		// 삭제해결하기
		// [1, 3, 5, ] -> [1, 5, ]
		list.remove(1);
		System.out.println(list);
//		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		
		
		// 초기화하기 -> |0|0|0| 이게 초기화 상태임. 
		list.clear();
		System.out.println(list);
//		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		
		
	}
}
