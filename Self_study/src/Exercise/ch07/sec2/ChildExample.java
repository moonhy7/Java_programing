package Exercise.ch07.sec2;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child(); 
		
		Parent parent = child; // �ڵ� Ÿ�� ��ȯ
		parent.method1(); // Parent-method1()
		parent.method2(); // �����ǵ� �޼ҵ尡 ȣ��� -> Child-method2() ���
		// parent.method3(); // ȣ�� �Ұ���
	}
}
