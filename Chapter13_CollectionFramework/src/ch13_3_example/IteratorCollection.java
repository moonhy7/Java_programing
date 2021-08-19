package ch13_3_example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> itr = list.iterator();
		
		// 반복자를 이용해서 순차적 참조
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		itr = list.iterator();
		
		System.out.println("=============================");
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		itr = list.iterator();
		
	}
}
