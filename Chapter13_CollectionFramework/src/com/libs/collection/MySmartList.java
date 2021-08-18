package com.libs.collection;

public class MySmartList<E> implements MyList<E> {
	// 필드 선언
	
	// 요소를 저장할 배열
	private Object[] elementData;
	
	// 현재 배열의 총 길이
	private int capacity;
	
	// 늘려줄 배열의 용량
	private final int amount = 3;
	
	// 배열 요소의 현재 위치
	private int cursor;
	
	
	// 생성자
	public MySmartList(int amount) {
		this.capacity = amount;
		elementData = new Object[capacity];
		cursor = 0;
	}
	
	public MySmartList() {
		this(3);
	}
	
	// 메소드
	@Override
	public void add(E e) {
		// 현재 용량을 초과하는지의 여부 조건 심사
		if(capacity <= cursor) {
			// 배열복사 수행 
			// (사이즈업한) 새로운 배열 생성
			Object[] tempArr = new Object[capacity + amount];
			
			// 요소 복사
			System.arraycopy(elementData, 0, tempArr, 0, elementData.length);
			
			// 참조 변경
			elementData = tempArr;
			
			// 배열 용량 업데이트
			capacity +=amount;
		}
			elementData[cursor++] = e;
	}
	
	@Override
	public E get(int index) {
		return index;
	}
	
	@Override
	public int size() {
		return 0;
	}
	
	@Override
	public void remove(int index) {
	}
	
	@Override
	public void clear() {
	}
	
	
}
