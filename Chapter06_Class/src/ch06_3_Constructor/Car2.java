package ch06_3_Constructor;

class Car2 {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car2() { //(1)번 생성자
	}
	Car2(String model) { //(2)번 생성자
		this.model = model;
	}
	Car2(String model, String color) { //(3)번 생성자
		this.model = model;
		this.color = color;
	}
	Car2(String model, String color, int maxSpeed) { //(4)번 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
