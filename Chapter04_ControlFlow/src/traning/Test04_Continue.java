package traning;

public class Test04_Continue {
	public static void main(String[] args) {
		// ���͸� ���� - continue��
		// �ڿ��� 1���� ����.. ��� Ȧ���� ����.. �� ���� ����(���� ��������)
		// 1000�� �Ѿ����, �׸��� 1000�� �Ѿ ������?
		// ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		// while�� ���
		
		int num = 1;
		int sum = 0;
		
		// if�� �� ��
//		while(sum<1000) {
//			if(num%2 != 0) {
//				sum += num;
//			} num++;
//		}
//		System.out.println(sum);

		// if�� �� ��
		while(sum<1000) {	
			// Ȧ�� ����
			if(num%2 != 0) {
				sum += num;
			} 
			// �� ����
			if(sum>1000) {
				System.out.println(num + "�� ���� �� 1000�� �ѽ��ϴ�.");
				System.out.println("�ʰ��� ��: "+ sum);
				break;
			}
			num++;
		}
	
		
	}
}
