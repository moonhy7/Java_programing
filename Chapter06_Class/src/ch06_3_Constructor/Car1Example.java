package ch06_3_Constructor;

public class Car1Example {
	public static void main(String[] args) {
		// ��ü ����(�ν��Ͻ�
		Car1 myCar = new Car1("�����","ī�Ϲ�","���","����");
		Car1 secondCar = new Car1("������","�ƹݶ�","�׷���","����"); 
		
		// �ʵ尪 �б�
		System.out.println("����ȸ��: " + secondCar.company);
		System.out.println("�𵨸�: " + secondCar.model);
		System.out.println("����: " + secondCar.color);
		System.out.println("�ְ�ӵ�: " + secondCar.maxSpeed);
		System.out.println("����ӵ�: " + secondCar.speed);
		System.out.println("����: " + secondCar.engin);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
		
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(100);
		System.out.println("c1�� ������: " + c1.rad);
		System.out.println("c2�� ������: " + c2.rad);
	}
}
