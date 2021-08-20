package reviewProblem.ch09;

class Car { 
	class Tire { } // 인스턴스 멤버 클래스
	static class Engine {} // 정적 멤버 클래스
}

public class NestedCarExample {
	public static void main(String[] args) {
		
		// 인스턴스 멤버 클래스 객체 생성 시 바깥 클래스의 객체 생성 후 사용 가능
		Car myCar = new Car(); // Car 객체 생성
		Car.Tire tire = myCar.new Tire(); // Tire 멤버 클래스 객체 생성
		
		// 정적 멤버 클래스 객체 생성 시 바깥 클래스의 객체가 없어도 사용 가능
		Car.Engine engine = new Car.Engine(); // Engine 멤버 클래스 객체 생성
		// myCar.이 안붙는 이유 : 정적 멤버는 바깥 객체가 없어도 그냥 바깥 클래스만으로 접근이 가능해서
	}
}
