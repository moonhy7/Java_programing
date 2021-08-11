package ch10_1_exception_class;

public class NullPointerExceptionExample {
	// �ʵ�
	int x;
	int y;
	boolean b;
	Person p; // Null�� �ʱ�ȭ�� 
	
	// main �޼ҵ�
	public static void main(String[] args) {
		String data = null;
		
		try {
			method();
			 // �Ʒ� �ڵ�� null ���� ���� ��ü��  ������ �õ��߱� ������ ���� �߻�
			System.out.println(data.toString());
			System.out.println(data.length());

		} catch(NullPointerException e) {
			System.out.println("���� �߻�");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻� �ڵ� ����!");
		}
		System.out.println("���α׷� ����");
	}
	
	// �޼ҵ� ����
	private static void method() {}
}
