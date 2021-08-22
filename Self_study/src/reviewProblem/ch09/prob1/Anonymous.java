package reviewProblem.ch09.prob1;

class Worker {
	public void start() {
		System.out.println("쉬고 있습니다.");
	}
}

public class Anonymous {
	// 필드 사용
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}
	};
	
	// 로컬 변수 사용
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
		};
		localVar.start();
	}
	
	// 매개 변수 사용
	void method2(Worker worker) {
		worker.start();
	}
}
