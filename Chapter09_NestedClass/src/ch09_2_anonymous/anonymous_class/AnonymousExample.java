package ch09_2_anonymous.anonymous_class;

public class AnonymousExample {
	public static void main(String[] args) {
		// ��ü ���� ����
		Anonymous anony = new Anonymous();
		
		// ��� 1 ���. �ʵ� ���
		anony.field.wake(); // 6�ÿ� �Ͼ�ϴ�. ����մϴ�.

		
		// ��� 2 ���. ���� ���� ���
		anony.method1(); // 7�ÿ� �Ͼ�ϴ�. ��å�մϴ�.
		
		
		// ��� 3 ���. �Ű������� �����Ͽ� ���
		anony.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}
				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}				
			}
		); // 8�ÿ� �Ͼ�ϴ�. �����մϴ�.
	}
}
