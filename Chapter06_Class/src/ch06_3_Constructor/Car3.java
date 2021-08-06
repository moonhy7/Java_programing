package ch06_3_Constructor;

public class Car3 {
	// 생성자
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//필드
	Car3() {
		
	}
	Car3(String model) { 
		this(model,"초록", 200);
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

