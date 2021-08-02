package ch02_4_console_in_out;

public class PrintfExample {
	public static void main(String[] args) {
		System.out.printf("�̸�:%s\n", "���ڹ�");
//		System.out.printf("�̸�:%s", "���ڹ�\n"); �� �ڵ�� ����, but ������ ��ó�� ���
		System.out.printf("����:%d\n", 27); // %d �ǹ� : decimal(10����)
		System.out.printf("����:%f\n", 186.5);
		System.out.printf("����:%e\n\n", 186.5); // ������ ǥ��
		
		
		
		//�̷��� ������ ������ ����
		System.out.println("[�̸�:" + "���ڹ�" + "], " + "[����:" + 27 + "]");
		System.out.printf("[�̸�:%s], [����:%d]", "���ڹ�",27);
		System.out.print("\n\n");
		
		// �̷��� �� ���� ���� ��°��� ���´�. 
		// ù° �ڵ�� ���Ⱑ �ʹ� �����ϴ�.
		// �Ϲ��� �ڵ尡 �� ���������ٸ� ������ �˾ƺ��Ⱑ ������̴�.
		// �׷��� �̷� ������ ���� �� ���ϰ� �������� �� ������ ���
		
		int value = 123;
		System.out.printf("��ǰ�� ����: %d��\n", value);
		System.out.printf("��ǰ�� ����: %6d��\n", value);
		System.out.printf("��ǰ�� ����: %-6d��\n", value);
		System.out.printf("��ǰ�� ����: %06d��\n\n", value);
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %f\n", 10 , area);
		System.out.printf("�������� %d�� ���� ����: %010.2f\n", 10 , area);
		System.out.printf("�������� %d�� ���� ����: %03.2f\n", 10 , area);

	}
}
