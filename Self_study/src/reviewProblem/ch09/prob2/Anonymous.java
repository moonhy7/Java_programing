package reviewProblem.ch09.prob2;

interface Vehicle {
	public void run();
}

public class Anonymous {
	
	// 1. �ʵ� ���
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
	
	// 2. ���� ���� ���
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		localVar.run();
	}
	
	// 3. �Ű��� ���
	void method2(Vehicle vehicle) {
		vehicle.run();
	}
}
