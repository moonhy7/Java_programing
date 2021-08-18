package ch13_1_collections;

import com.libs.collection.MyIntList;

public class MyCollectionTest2 {
	public static void main(String[] args) {
		MyIntList list = new MyIntList(3); 
		
		list.add(1); // 1회  |>| | | | |
		list.add(3); // 2회  | |>| | | | // 옮겨다님
		list.add(5); // 3회
	
		// ArrayIndexOutOfBoundsException 해결하기
		list.add(7);
		System.out.println(list);
		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		// 삭제해결하기
		// [1, 3, 5, ] -> [1, 5, ]
		list.remove(1);
		System.out.println(list);
		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		
		
		// 초기화하기 -> |0|0|0| 이게 초기화 상태임. 
		list.clear();
		System.out.println(list);
		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		
		
	}
}
