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
		 * - ArrayList는 내부 배열에 객체를 저장해서 관리하지만
		 * - LinkedList는 인접 참조를 링크해서 체인처럼 관리
		 * - 특정 인덱스의 객체를 삽입/삭제 시 앞 뒤 링크만 변경되고
		 * 	  나머지 필드는 불변(배열복사 불필요)
		 * 	  따라서 끝에서부터 (순차적으로) 추가/삭제하는 경우 ArrayList가 빠르고
		 *	  중간에 추가/삭제 할 경우 LinkedList가 더 빠르다. 
		 */
	
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<DELAY; i++) {
			list1.add(0, Integer.toString(i));
		}
			
		endTime = System.nanoTime();
		System.out.printf("ArrayList 걸린시간: %5d ns\n", endTime - startTime);

		startTime = System.nanoTime();
		for(int i=0; i<DELAY; i++) {
			list2.add(0, Integer.toString(i));
		}
		
		endTime = System.nanoTime();
		System.out.printf("ArrayList 걸린시간: %5d ns\n", endTime -startTime);
		
	}
}
