package ch06_3_Constructor;

public class Car1Example {
	public static void main(String[] args) {
		// 객체 생성(인스턴스
		Car1 myCar = new Car1("기아차","카니발","흰색","엔진");
		Car1 secondCar = new Car1("현대차","아반떼","그레이","엔진"); 
		
		// 필드값 읽기
		System.out.println("제작회사: " + secondCar.company);
		System.out.println("모델명: " + secondCar.model);
		System.out.println("색깔: " + secondCar.color);
		System.out.println("최고속도: " + secondCar.maxSpeed);
		System.out.println("현재속도: " + secondCar.speed);
		System.out.println("엔진: " + secondCar.engin);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(100);
		System.out.println("c1의 반지름: " + c1.rad);
		System.out.println("c2의 반지름: " + c2.rad);
	}
}
