package ch06_4_method;

public class Calculator_rectangle_Example {
	public static void main(String[] args) {
		Calculator_rectangle myCalcu = new Calculator_rectangle();
		
		// ���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		
		// ���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10,20);
		
		// ��� ���
		System.out.println("���簢�� ���� = " + result1);
		System.out.println("���簢�� ���� = " + result2);
	}
}
