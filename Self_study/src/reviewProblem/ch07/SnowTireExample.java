package reviewProblem.ch07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // �ڵ� Ÿ�� ��ȯ
		// Tire tire = new SnowTire(); // �̷��� �� �ٷ� �� ���� ����
		
		snowTire.run(); // ����� Ÿ�̾ �������ϴ�.
		tire.run(); // ����� Ÿ�̾ �������ϴ�.
	}
}