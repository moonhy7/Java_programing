package ch07_3_abstract_class;

// 규격 클래스
abstract class Phone {
	//필드
	public String owner;
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
 }
// 자식 클래스
//class SmartPhone extends Phone {
//	
//}
//
//public class PhoneExample {
//	public static void main(String[] args) {
//		Phone p1 = new Phone();
//	}
//}
