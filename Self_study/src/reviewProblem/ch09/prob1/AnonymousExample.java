package reviewProblem.ch09.prob1;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// �͸� ��ü �ʵ� ���
		anony.field.start();
		
		// �͸� ��ü ���� ���� ���
		anony.method1();
		
		// �͸� ��ü �Ű��� ���
		anony.method2(
			new Worker() {
				@Override
				public void start() {
					System.out.println("�׽�Ʋ�� �մϴ�.");
				}
			}
		);
	}
}
