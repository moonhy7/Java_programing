package ch13_1_collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		/** [Vector] implements List
		 * 
		 * - ArrayList와 동일한 내부구조
		 * - 동기화된(synchronized) 메소드로 구성
		 *   :  멀티 스레드가 동시에 Vector메소드 실행 불가. 하나의 스레드가
		 *   	메소드 실행을 완료해야만 다른 스레드가 메소드 실행 가능(thread safe)
		 */
		
		List<Board> list = new Vector<>();
		
		// Board 객체를 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		System.out.println(list);
		
		// 제목3 삭제
		list.remove(2);
		// 제목5 삭제
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			// Board 객체 가져오기
			Board b = list.get(i);
			System.out.printf("%s\t%s\t%s\t\n",b.getSubject(), b.getContent(), b.getWriter());
		}
	}
}
