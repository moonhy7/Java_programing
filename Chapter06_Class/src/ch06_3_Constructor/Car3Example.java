package ch06_3_Constructor;

public class Car3Example {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3("아반떼");
		Car3 c3 = new Car3("그랜저","분홍");
		Car3 c4 = new Car3("그랜저","노랑",300);
		
		System.out.println(c1.company); // 현대자동차
		System.out.println(c1.model); // null
		System.out.println(c1.color); // null
		System.out.println(c1.maxSpeed); // 0
		
		System.out.println(c2.company); // 현대자동차
		System.out.println(c2.model); // 아반떼
		System.out.println(c2.color); // 초록
		System.out.println(c2.maxSpeed); // 200
		
		System.out.println(c3.company); // 현대자동차
		System.out.println(c3.model); // 그랜저
		System.out.println(c3.color); // 분홍
		System.out.println(c3.maxSpeed); // 400
		
		System.out.println(c4.company); // 현대자동차
		System.out.println(c4.model); // 그랜저
		System.out.println(c4.color); // 노랑
		System.out.println(c4.maxSpeed); // 300
	}
}
