package ch06_3_Constructor;

public class Car2Example {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); //(1)�� �����ڸ� ������
		System.out.println(c1.company); // �����ڵ���
		System.out.println(c1.color); // null�� ��
		
		Car2 c2 = new Car2("�ڰ���"); //(2)�� �����ڸ� ������
		System.out.println(c2.company); // �����ڵ���
		System.out.println(c2.model); // �ڰ���
		
		Car2 c3 = new Car2("�ڰ���","����"); //(3)�� �����ڸ� ������
		System.out.println(c3.company); // �����ڵ���
		System.out.println(c3.model); // �ڰ���
		System.out.println(c3.color); // ����
		
		Car2 c4 = new Car2("�ý�","���", 100); //(4)�� �����ڸ� ������
		System.out.println(c4.company); // �����ڵ���
		System.out.println(c4.model); // �ý�
		System.out.println(c4.color); // ���
		System.out.println(c4.maxSpeed); // 100
	}
}

