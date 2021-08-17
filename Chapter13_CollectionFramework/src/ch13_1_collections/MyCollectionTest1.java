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
		
		// list[3] = 7; 추가? ArrayIndexOutOfBoundsException
		// 배열 복사 필요
		// list[3] = 7;
		
		// list[1] 삭제?
		// 배열 복사 필요
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
		 * list.add(7); 알아서 늘려 주고
		 * list.remove(2); 알아서 삭제해 주고
		 * 
		 * list.toString(); 배열 요솔ㄹ 찍어주고
		 * 
		 * 이런 자료 타입이 있으면 좋을텐데...........TT;;
		 */
	}
}
