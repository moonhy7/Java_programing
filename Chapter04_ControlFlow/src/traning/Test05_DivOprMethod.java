package traning;

public class Test05_DivOprMethod {
	public static void main(String[] args) {
		// ��� �������� ����ϴ� �޼ҵ带 �����
		// �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		// ��) divOpr(7,3);
		// �ܼ���� -> "��: 2, ������: 1"
		divOpr(7,3);
	}
	private static void divOpr(int i, int j) {
		System.out.printf("��: %d, ������: %d\n", i/j, i%j);
	}
	
}
