package Exercise;

public class Calculator {
	//�޼ҵ�
	int plus(int x, int y) { // �� �޼ҵ�
		int result = x + y; 
		return result;
	}
	
	double avg(int x, int y) { // ��� �޼ҵ�
		double sum = x + y;
		double result = sum / 2;
		return result;
	}
	
	void execute() { // ��� ���� �޼ҵ�
		double result = avg(7,10);
		println("������ : " + result);
	}
	
	void println(String message) { // ��� �޼ҵ�
		System.out.println(message);
	}
}