package com.libs.collection;
/**
 * �ڷᱸ�� ������ ���� �޼ҵ� �԰��� ������ �������̽� �ۼ�
 */

public interface MyList<E> { // element Ÿ���� ���� -> � ���̵� ���� �� ����
	public abstract void add(E element);
	public abstract E get(int index);
	public abstract int size();
	public abstract void remove(int num);
	public abstract void clear();
}
