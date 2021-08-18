package ch13_1_collections;

import com.libs.collection.MyIntList;

public class MyCollectionTest2 {
	public static void main(String[] args) {
		MyIntList list = new MyIntList(3); 
		
		list.add(1); // 1ȸ  |>| | | | |
		list.add(3); // 2ȸ  | |>| | | | // �Űܴٴ�
		list.add(5); // 3ȸ
	
		// ArrayIndexOutOfBoundsException �ذ��ϱ�
		list.add(7);
		System.out.println(list);
		System.out.println("list[2]�� ��: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		// �����ذ��ϱ�
		// [1, 3, 5, ] -> [1, 5, ]
		list.remove(1);
		System.out.println(list);
		System.out.println("list[2]�� ��: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		
		
		// �ʱ�ȭ�ϱ� -> |0|0|0| �̰� �ʱ�ȭ ������. 
		list.clear();
		System.out.println(list);
		System.out.println("list[2]�� ��: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("======================================");
		
		
		
	}
}
