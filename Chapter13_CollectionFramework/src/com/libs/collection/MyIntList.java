package com.libs.collection;

public class MyIntList {
	// 필드
	private int[] arr;
	private int cursor;
	
	// 생성자
	public MyIntList(int amount) {
		this.arr = new int[amount];
		cursor = 0;
	}
	
	// 메소드
	public void add(int num) {
		arr[cursor++] = num;
	}
	
	public void remove(int i) {
		
	}
	
	public int get(int index) {
		return arr[index];
	}

	public int size() {
		return cursor;
	}
	
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
