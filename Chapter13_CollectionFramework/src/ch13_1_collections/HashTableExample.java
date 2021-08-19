package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		/** [HashTable] implements Map
		 * 
		 * HashMap�� ������ ���α���
		 * - ����ȭ(synchronized)�� �޼ҵ�� ����
		 *   : �ϳ��� �����尡 ���� �Ϸ��ؾ߸� �ٸ� ������ ���� ����
		 */
		
		/*
		 * ���̵� ��� �˻��ϱ�
		 */
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��� �ּ���.");
			
			System.out.print("���̵�: ");
			String id = scan.nextLine().trim();
		
			System.out.print("��й�ȣ: ");
			String pw = scan.nextLine().trim();
			
			System.out.println();
			
			// ID�� ���ٸ�...
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ�." + " �ٽ� �Է��� ����.");
				continue;
			}
			// ID�� �ִٸ�...
			else {
				// ��� ����ġ
				if(!map.get(id).equals(pw)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�." + " �ٽ� �Է��� ����.");
				}
				// ��� ��ġ
				else {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
			} 
		}
		scan.close();
	}
}
