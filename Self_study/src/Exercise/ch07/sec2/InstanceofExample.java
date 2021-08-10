package Exercise.ch07.sec2;

public class InstanceofExample {
	
	//타입변환이 가능한지 확인하는 메소드
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	//타입변환이 가능한지 확인하지 않고 그냥 바로 변환하는 메소드 
	public static void method2(Parent parent) {
		Child child = (Child) parent; // classCastException 에러가 발생할 수도 있음
		System.out.println("method1 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child(); // 먼저 자동형변환 해주기
		method1(parentA); // Child 객체를 매개값으로 전달
		method2(parentA); // 강제형변환이 가능한 경우이므로 method1,2 둘다 에러X
		
		Parent parentB = new Parent(); // 그냥 Parent 타입으로 받음
		method1(parentB); // Parent 객체를 매개값으로 전달하며 강제형변환 불가하다고 뜸
//		method2(parentB); // 예외 발생 -> 강제형변환이 안되는 경우이며 그마저도 타입변환이 가능한지 확인해보지도 않아서 예외가 발생
	}
}
