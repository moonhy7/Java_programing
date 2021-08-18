package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("�Ӳ���", 27));
		set.add(new Member("ȫ�浿", 25));
		set.add(new Member("�Ӳ���", 27));
		
		System.out.println("�� ��ü��: " + set.size());
		System.out.println(set);
	
		Iterator<Member> itr = set.iterator();
		while(itr.hasNext()) {
			Member m = itr.next();
			System.out.println(m.name + ", " + m.age);
		}
		// �۾��Ϸ� �� itr �ʱ�ȭ
		itr = set.iterator();
	}
}
