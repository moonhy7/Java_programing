package ch10_1_exception_class;

class Person {}

public class NullPointExceptionExample_me {
	int x;
	int y;
	boolean b;
	Person p; // p�� Null�� �ʱ�ȭ�� 
	
	public static void main(String[] args) {
		String data1 = "";
		System.out.println(data1.toString()); // �ƹ��͵� ����� �ȵ�
		System.out.println(data1.length()); // 0
		
		String data3 = " ";
		System.out.println(data3.toString()); // ���Ⱑ ��µ�
		System.out.println(data3.length()); // 1
		
		String data2 = null; // String data; ��� ����(�ڵ����� null�� �ʱ�ȭ��)�� �Ͱ� ���� �ڵ���
		System.out.println(data2.toString()); //���� �߻�
		System.out.println(data2.length()); //���� �߻�
		
		System.out.println("���α׷� ����");
	}
}
