package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		/** [HashSet] implements Set
		 * 
		 * List�÷���(�������̽�)�� ��ü�� ������ ����������,
		 * - Set �÷���(�������̽�)�� ���� ������ �������� �ʴ´�.
		 * - �ε����� ���� ���� �ʴ´�.
		 * 	 : �ݺ���(Iterator) �����Ѵ�.
		 * 	 �ߺ��ؼ� ������ �� ���� ������ ���� ����
		 * 
		 */
		
		Set<String> set = new HashSet<>();
		
		// HashCode() + equal()
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		
		// ���� ��ü ����
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: " + size);
		
		// �ݺ��ڸ� �̿��� ����
		Iterator<String> itr = set.iterator(); // �ش� �ڷᱸ���� �ݺ��� ���
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("\t" + str);
		}
		System.out.println();
		
		// set.remove("JDBC");
		// set.remove("iBATIS");
		
		System.out.println("�� ��ü��: " + set.size());
		System.out.println("======================================");
		
		// �ݺ��� �ٽ� ���(�ʱ�ȭ)
		 itr = set.iterator(); //
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("\t" + str);
		}
		
		itr = set.iterator(); // �ʱ�ȭ �ϴ� ����!!!
		System.out.println("======================================");
		
		
		// for�� ����
		for(String e : set) {
			System.out.println("\t" + e);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�������(" + set.size() + ")");
		}	
	}
}
