package ch06_3_Constructor;

class Car2 {
	// 필드
	String company;
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	public Car2() {
	}
	
	Car2(String model) {
//		this.color = "파랑"; 에러
		this.model = model; //model 보다 color 문장이 더 위에 오면 에러
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

