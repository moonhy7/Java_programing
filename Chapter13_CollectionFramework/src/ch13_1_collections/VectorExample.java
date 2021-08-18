package ch13_1_collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		/** [Vector] implements List
		 * 
		 * - ArrayList�� ������ ���α���
		 * - ����ȭ��(synchronized) �޼ҵ�� ����
		 *   :  ��Ƽ �����尡 ���ÿ� Vector�޼ҵ� ���� �Ұ�. �ϳ��� �����尡
		 *   	�޼ҵ� ������ �Ϸ��ؾ߸� �ٸ� �����尡 �޼ҵ� ���� ����(thread safe)
		 */
		
		List<Board> list = new Vector<>();
		
		// Board ��ü�� ����
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		System.out.println(list);
		
		// ����3 ����
		list.remove(2);
		// ����5 ����
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			// Board ��ü ��������
			Board b = list.get(i);
			System.out.printf("%s\t%s\t%s\t\n",b.getSubject(), b.getContent(), b.getWriter());
		}
	}
}
