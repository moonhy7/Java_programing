package ch06_3_Constructor;

public class Car3Example {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3("�ƹݶ�");
		Car3 c3 = new Car3("�׷���","��ȫ");
		Car3 c4 = new Car3("�׷���","���",300);
		
		System.out.println(c1.company); // �����ڵ���
		System.out.println(c1.model); // null
		System.out.println(c1.color); // null
		System.out.println(c1.maxSpeed); // 0
		
		System.out.println(c2.company); // �����ڵ���
		System.out.println(c2.model); // �ƹݶ�
		System.out.println(c2.color); // �ʷ�
		System.out.println(c2.maxSpeed); // 200
		
		System.out.println(c3.company); // �����ڵ���
		System.out.println(c3.model); // �׷���
		System.out.println(c3.color); // ��ȫ
		System.out.println(c3.maxSpeed); // 400
		
		System.out.println(c4.company); // �����ڵ���
		System.out.println(c4.model); // �׷���
		System.out.println(c4.color); // ���
		System.out.println(c4.maxSpeed); // 300
	}
}
