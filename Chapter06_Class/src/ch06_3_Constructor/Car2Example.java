package ch06_3_Constructor;

class Car2 {
	// �ʵ�
	String company;
	String model;
	String color;
	int maxSpeed;
	
	// ������
	public Car2() {
	}
	
	Car2(String model) {
//		this.color = "�Ķ�"; ����
		this.model = model; //model ���� color ������ �� ���� ���� ����
	}
	
	Car2(String model, String color) {
//		this(model, color);
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;		
	}
	
	int add(int x) {
		return 0;
	}
	int add(int x, int y) {
		return 0;
	}
	int add(int x, int y, int z) {
		return 0;
	}
}

public class Car2Example {
	public static void main(String[] args) {
	}
}

