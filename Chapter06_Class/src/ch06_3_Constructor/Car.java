package ch06_3_Constructor;

public class Car {
	// ÇÊµå
	String company = "";
	String model = "";
	String color = "";
	String engin = "";
	
	int maxSpeed = 350;
	int speed;
	
	Car(String company, String model, String color, String engin) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.engin = engin;
	}
	
//	Car2(String company, String model, String color) {
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.engin = engin;

	}
	
	

