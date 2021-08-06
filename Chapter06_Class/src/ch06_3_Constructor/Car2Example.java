package ch06_3_Constructor;

public class Car2Example {
	public static void main(String[] args) {
		Car2 c1 = new Car2(); //(1)번 생성자를 선택함
		System.out.println(c1.company); // 현대자동차
		System.out.println(c1.color); // null이 뜸
		
		Car2 c2 = new Car2("자가용"); //(2)번 생성자를 선택함
		System.out.println(c2.company); // 현대자동차
		System.out.println(c2.model); // 자가용
		
		Car2 c3 = new Car2("자가용","빨강"); //(3)번 생성자를 선택함
		System.out.println(c3.company); // 현대자동차
		System.out.println(c3.model); // 자가용
		System.out.println(c3.color); // 빨강
		
		Car2 c4 = new Car2("택시","노랑", 100); //(4)번 생성자를 선택함
		System.out.println(c4.company); // 현대자동차
		System.out.println(c4.model); // 택시
		System.out.println(c4.color); // 노랑
		System.out.println(c4.maxSpeed); // 100
	}
}

