package ch04_4_while;

public class ContinueExample {
	public static void main(String[] args) {
		// continue���� ���͸��� ���� �� ���
		// Ȧ���� �Ѿ�� �� ������ �ݵ�� ���ø���
		// ¦���� ����
		// Ȧ���� continue�ؼ� �Ѿ�� ����
		for(int i=1;i<=10;i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i+"\t");
		}
	}
}
