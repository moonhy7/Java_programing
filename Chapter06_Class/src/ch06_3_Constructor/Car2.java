package ch06_3_Constructor;

class Car2 {

	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car2() { //(1)�� ������
	}
	Car2(String model) { //(2)�� ������
		this.model = model;
	}
	Car2(String model, String color) { //(3)�� ������
		this.model = model;
		this.color = color;
	}
	Car2(String model, String color, int maxSpeed) { //(4)�� ������
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
