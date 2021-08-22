package reviewProblem.ch09.prob1;

class Worker {
	public void start() {
		System.out.println("���� �ֽ��ϴ�.");
	}
}

public class Anonymous {
	// �ʵ� ���
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("�������� �մϴ�.");
		}
	};
	
	// ���� ���� ���
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("������ �մϴ�.");
			}
		};
		localVar.start();
	}
	
	// �Ű� ���� ���
	void method2(Worker worker) {
		worker.start();
	}
}
