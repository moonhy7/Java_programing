package reviewProblem.ch09.prob2;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// �͸� ��ü �ʵ� ���
		anony.field.run();
		
		// �͸� ��ü ���� ���� ���
		anony.method1();
		
		// �͸� ��ü �Ű��� ���
		anony.method2(
			new Vehicle() {
				@Override
				public void run() {
					System.out.println("Ʈ���� �޸��ϴ�.");
				}
			}
		);
		
	}
}
