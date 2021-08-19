package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		/** [HashTable] implements Map
		 * 
		 * HashMap과 동일한 내부구조
		 * - 동기화(synchronized)된 메소드로 구성
		 *   : 하나의 스레드가 실행 완료해야만 다른 스레드 접근 가능
		 */
		
		/*
		 * 아이디 비번 검사하기
		 */
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요.");
			
			System.out.print("아이디: ");
			String id = scan.nextLine().trim();
		
			System.out.print("비밀번호: ");
			String pw = scan.nextLine().trim();
			
			System.out.println();
			
			// ID가 없다면...
			if(!map.containsKey(id)) {
				System.out.println("입력하신 ID가 존재하지 않습니다." + " 다시 입력해 세요.");
				continue;
			}
			// ID가 있다면...
			else {
				// 비번 불일치
				if(!map.get(id).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다." + " 다시 입력해 세요.");
				}
				// 비번 일치
				else {
					System.out.println("로그인 되었습니다.");
					break;
				}
			} 
		}
		scan.close();
	}
}
