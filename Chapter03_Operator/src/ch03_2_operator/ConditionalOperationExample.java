package ch03_2_operator;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		// main���� ��� run �� ���� �ʾҴ�����
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
	
		System.out.printf("%d���� %c����Դϴ�.\n",score, grade);
	
	}
	
}
 