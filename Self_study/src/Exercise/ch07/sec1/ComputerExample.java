package Exercise.ch07.sec1;

public class ComputerExample { // �ڽ� Ŭ���� ����
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator(); // �� ��Ȯ�� ���� ��� �޼ҵ�
		System.out.println("������: " + calculator.areaCircle(r) + "\n");
		
		Computer computer = new Computer(); // ��Ȯ�� ���� ��� �޼ҵ�
		System.out.println("������: " + computer.areaCircle(r));
	}
}
