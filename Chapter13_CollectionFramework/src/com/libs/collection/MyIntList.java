package com.libs.collection;

/**
 * 2021.08.18
 * java 211기
 * @author 문하윤
 *	int[] 관리하기 위한 자료구조
 */

public class MyIntList {
	// [필드]
	
	// 요소를 저장할 배열
	private int[] arr;
	
	// 현재 배열의 총 길이
	private int capacity;
	
	// 늘려줄 배열의 용량
	private final int amount;
	
	// 배열 요소의 현재 위치
	private int cursor;
	
	
	// 생성자
	public MyIntList(int amount) {
		this.amount = amount;
		this.capacity = this.amount;
		this.arr = new int[capacity];
		cursor = 0;
	}
	
	// 메소드
	// 요소 추가
	public void add(int num) {
		// 현재 용량을 초과하는지의 여부 조건 심사
		if(capacity <= cursor) {
			// 배열복사 수행 
			// (사이즈업한) 새로운 배열 생성
			int[] tempArr = new int[capacity + amount];
			// 요소 복사
			System.arraycopy(arr, 0, tempArr, 0, arr.length);
			
			// 참조 변경
			arr = tempArr;
			
			// 배열 용량 업데이트
			capacity +=amount;
			
		} 
		arr[cursor++] = num;
	}
	
	// 요소 삭제
	public void remove(int index) {
		// 삭제하고자 하는 index가 마지막이면 0으로 초기화
		if(index != cursor - 1) {
			System.arraycopy(arr, index + 1, arr, index, (cursor-1) - index);
		}
		// 마지막 데이터 초기화
		arr[index] = 0;
		
		// 현재 위치 재설정
		cursor--;
		
	}
	
	// 요소 얻기
	public int get(int index) {
		return arr[index];
	}
	
	// 요소 개수
	public int size() {
		return cursor;
	}
	
	// 요소 출력
	@Override
	public String toString() {
		String tmp = "";
		for(int i : arr) {
			tmp += i + ", ";
		}
		return "[" + tmp + "]";
	}

	public void clear() {
		
	}

	

}
