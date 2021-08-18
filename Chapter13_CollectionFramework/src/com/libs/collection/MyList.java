package com.libs.collection;
/**
 * 자료구조 구현을 위한 메소드 규격을 정의한 인터페이스 작성
 */

public interface MyList<E> { // element 타입을 받음 -> 어떤 형이든 받을 수 있음
	public abstract void add(E element);
	public abstract E get(int index);
	public abstract int size();
	public abstract void remove(int num);
	public abstract void clear();
}
