package ch04_1_if;

public class IfExample {
	public static void main(String[] args) {
		
		// ������ 2���϶� (if�� ���׿�����)
		
//		int score = 95;
//		char grade;	// ��� ǥ�ô� �������ϴµ� ��������, ������ syso������ �ȵǾ ����� ���ð� ����! �� ������
//		
//		if(score > 90) {
//			grade = 'A';
//		} else {
//			grade = 'B';
//		}
//		System.out.println(grade);
//		
////		�̰žƴϸ� ���ž�! �׷��� if�� ����!!
////		���׿����ڶ� ������ �Ȱ���!
//		grade = (score>90) ? 'A' :'B';
//		System.out.println(grade);
		
		
		// ������ 3���϶� (if�� ���׿�����)
//		int score2 = 85;
//		grade = (score2>90) ? 'A' : ((score2>80) ? 'B' : 'C');
//		
//		System.out.println(grade);
//		
//		if(score2 > 90) {
//			grade = 'A';
//		} else {
//			if(score2 > 80) {
//				grade = 'B';
//			}
//			else {
//				grade = 'C';
//			}
//		}
//		System.out.println(grade);
		
		//else if �̿��ϱ�
		int score = 75;
		char grade;
		
		if (score > 90) {
			grade = 'A';
		} else if(score >= 80 && score < 90) {
			grade = 'B';
		} else if(score >= 70 && score <80) {
			grade = 'C';
		} else if(score >= 60 && score < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		// Ȯ���� ���ɼ��� ���� �ָ� ���� �ø��°� ���� ��ħ���� ����
		// �׷��� ���⼭ D��޾ֵ� ���� ���� ���ٰ� �ؼ� ������ �ø��� ����!
		// ���� ���Ⱑ �����ϴϱ�
		
		System.out.println(grade); // else�� ��� ���� �߻�
//		��Ŭ������ ģ���ϰԵ� score = 55�� �� ���� �ִµ� �� ��쿡�� �ȵȴ�~ �� �̸� ������ �˷��ִ°�
	
		
		
		
//		������ 3���� �ص� �ʹ� ������
//		�׷��� ���°� switch��

		
	}
}
