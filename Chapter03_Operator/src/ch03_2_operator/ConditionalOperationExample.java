package ch03_2_operator;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		// main문이 없어서 run 이 되지 않았던것임
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
	
		System.out.printf("%d점은 %c등급입니다.\n",score, grade);
	
	}
	
}
 