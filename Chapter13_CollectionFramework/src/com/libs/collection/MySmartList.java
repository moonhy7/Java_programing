package com.libs.collection;

public class MySmartList<E> implements MyList<E> {
	// �ʵ� ����
	
	// ��Ҹ� ������ �迭
	private Object[] elementData;
	
	// ���� �迭�� �� ����
	private int capacity;
	
	// �÷��� �迭�� �뷮
	private final int amount = 3;
	
	// �迭 ����� ���� ��ġ
	private int cursor;
	
	
	// ������
	public MySmartList(int amount) {
		this.capacity = amount;
		elementData = new Object[capacity];
		cursor = 0;
	}
	
	public MySmartList() {
		this(3);
	}
	
	// �޼ҵ�
	@Override
	public void add(E e) {
		// ���� �뷮�� �ʰ��ϴ����� ���� ���� �ɻ�
		if(capacity <= cursor) {
			// �迭���� ���� 
			// (���������) ���ο� �迭 ����
			Object[] tempArr = new Object[capacity + amount];
			
			// ��� ����
			System.arraycopy(elementData, 0, tempArr, 0, elementData.length);
			
			// ���� ����
			elementData = tempArr;
			
			// �迭 �뷮 ������Ʈ
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
