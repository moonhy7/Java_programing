package reviewProblem.ch09;

class Car { 
	class Tire { } // �ν��Ͻ� ��� Ŭ����
	static class Engine {} // ���� ��� Ŭ����
}

public class NestedCarExample {
	public static void main(String[] args) {
		
		// �ν��Ͻ� ��� Ŭ���� ��ü ���� �� �ٱ� Ŭ������ ��ü ���� �� ��� ����
		Car myCar = new Car(); // Car ��ü ����
		Car.Tire tire = myCar.new Tire(); // Tire ��� Ŭ���� ��ü ����
		
		// ���� ��� Ŭ���� ��ü ���� �� �ٱ� Ŭ������ ��ü�� ��� ��� ����
		Car.Engine engine = new Car.Engine(); // Engine ��� Ŭ���� ��ü ����
		// myCar.�� �Ⱥٴ� ���� : ���� ����� �ٱ� ��ü�� ��� �׳� �ٱ� Ŭ���������� ������ �����ؼ�
	}
}
