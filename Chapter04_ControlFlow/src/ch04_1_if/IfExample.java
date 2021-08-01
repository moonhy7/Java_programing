package ch04_1_if;

public class IfExample {
	public static void main(String[] args) {
		
		// ������ 2���϶� (if�� ���׿�����)
		
		int score = 95;
		char grade;	
		// ���� ǥ�� : ��� ǥ�ô� �������ϴµ� ��������, ������ syso������ �ȵǾ ����� ���ð� ����! �� ������
		
		if(score > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		System.out.println(grade);
		
		// �̰žƴϸ� ���ž�! �׷��� if�� ����!!
		// ���׿����ڶ� ������ �Ȱ���!
		grade = (score>90) ? 'A' :'B';
		System.out.println(grade);

		// ������ 3���϶� (if�� ���׿�����)
		
		// if��
		int score1 = 85;
		
		if(score1 > 90) {
			grade = 'A';
		} else {
			if(score1 > 80) {
				grade = 'B';
			}
			else {
				grade = 'C';
			}
		} System.out.println(grade);

		// ���� ������
		grade = (score1>90) ? 'A' : ((score1>80) ? 'B' : 'C');
		System.out.println(grade);
		
		
		//else if �̿��ϱ�
		int score2 = 75;
		char grade2;
		
		if (score2 > 90) {
			grade2 = 'A';
		} else if(score2 >= 80 && score2 < 90) {
			grade2 = 'B';
		} else if(score2 >= 70 && score2 <80) {
			grade2 = 'C';
		} else if(score2 >= 60 && score2 < 70) {
			grade2 = 'D';
		} else {
			grade2 = 'F';
		}
		// Ȯ���� ���ɼ��� ���� �ָ� ���� �ø��°� ���� ��ħ���� ����
		// �׷��� ���⼭ D��޾ֵ� ���� ���� ���ٰ� �ؼ� ������ �ø��� ����!
		// ���� ���Ⱑ �����ϴϱ�
		
		System.out.println(grade2); // C
		// else�� ��� ���� �߻�
//		��Ŭ������ ģ���ϰԵ� score = 55�� �� ���� �ִµ� �� ��쿡�� �ȵȴ�~ �� �̸� ������ �˷��ִ°�

//		������ 3���� �ص� �ʹ� ������
//		�׷��� ���°� switch��

		
	}
}
