package com.libs.collection;

/**
 * 2021.08.18
 * java 211��
 * @author ������
 *	int[] �����ϱ� ���� �ڷᱸ��
 */

public class MyIntList {
	// [�ʵ�]
	
	// ��Ҹ� ������ �迭
	private int[] arr;
	
	// ���� �迭�� �� ����
	private int capacity;
	
	// �÷��� �迭�� �뷮
	private final int amount;
	
	// �迭 ����� ���� ��ġ
	private int cursor;
	
	
	// ������
	public MyIntList(int amount) {
		this.amount = amount;
		this.capacity = this.amount;
		this.arr = new int[capacity];
		cursor = 0;
	}
	
	// �޼ҵ�
	// ��� �߰�
	public void add(int num) {
		// ���� �뷮�� �ʰ��ϴ����� ���� ���� �ɻ�
		if(capacity <= cursor) {
			// �迭���� ���� 
			// (���������) ���ο� �迭 ����
			int[] tempArr = new int[capacity + amount];
			// ��� ����
			System.arraycopy(arr, 0, tempArr, 0, arr.length);
			
			// ���� ����
			arr = tempArr;
			
			// �迭 �뷮 ������Ʈ
			capacity +=amount;
			
		} 
		arr[cursor++] = num;
	}
	
	// ��� ����
	public void remove(int index) {
		// �����ϰ��� �ϴ� index�� �������̸� 0���� �ʱ�ȭ
		if(index != cursor - 1) {
			System.arraycopy(arr, index + 1, arr, index, (cursor-1) - index);
		}
		// ������ ������ �ʱ�ȭ
		arr[index] = 0;
		
		// ���� ��ġ �缳��
		cursor--;
		
	}
	
	// ��� ���
	public int get(int index) {
		return arr[index];
	}
	
	// ��� ����
	public int size() {
		return cursor;
	}
	
	// ��� ���
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
