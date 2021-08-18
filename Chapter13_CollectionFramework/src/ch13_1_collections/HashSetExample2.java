package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("ÀÓ²©Á¤", 27));
		set.add(new Member("È«±æµ¿", 25));
		set.add(new Member("ÀÓ²©Á¤", 27));
		
		System.out.println("ÃÑ °´Ã¼¼ö: " + set.size());
		System.out.println(set);
	
		Iterator<Member> itr = set.iterator();
		while(itr.hasNext()) {
			Member m = itr.next();
			System.out.println(m.name + ", " + m.age);
		}
		// ÀÛ¾÷¿Ï·á ÈÄ itr ÃÊ±âÈ­
		itr = set.iterator();
	}
}
