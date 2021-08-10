package Exercise.ch07.sec2;

public class InstanceofExample {
	
	//Ÿ�Ժ�ȯ�� �������� Ȯ���ϴ� �޼ҵ�
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	
	//Ÿ�Ժ�ȯ�� �������� Ȯ������ �ʰ� �׳� �ٷ� ��ȯ�ϴ� �޼ҵ� 
	public static void method2(Parent parent) {
		Child child = (Child) parent; // classCastException ������ �߻��� ���� ����
		System.out.println("method1 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child(); // ���� �ڵ�����ȯ ���ֱ�
		method1(parentA); // Child ��ü�� �Ű������� ����
		method2(parentA); // ��������ȯ�� ������ ����̹Ƿ� method1,2 �Ѵ� ����X
		
		Parent parentB = new Parent(); // �׳� Parent Ÿ������ ����
		method1(parentB); // Parent ��ü�� �Ű������� �����ϸ� ��������ȯ �Ұ��ϴٰ� ��
//		method2(parentB); // ���� �߻� -> ��������ȯ�� �ȵǴ� ����̸� �׸����� Ÿ�Ժ�ȯ�� �������� Ȯ���غ����� �ʾƼ� ���ܰ� �߻�
	}
}
