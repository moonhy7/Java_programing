package reviewProblem.ch09.prob2;

interface Vehicle {
	public void run();
}

public class Anonymous {
	
	// 1. 필드 사용
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	// 2. 로컬 변수 사용
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	
	// 3. 매개값 사용
	void method2(Vehicle vehicle) {
		vehicle.run();
	}
}
