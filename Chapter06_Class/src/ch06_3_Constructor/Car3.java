package ch06_3_Constructor;

public class Car3 {
	// ������
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//�ʵ�
	Car3() {
		
	}
	Car3(String model) { 
		this(model,"�ʷ�", 200);
	}
	Car3(String model, String color) { 
		this(model, color, 400);
	}
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

