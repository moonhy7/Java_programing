package Exercise.ch07.sec2;

public class Child_1Example {
	public static void main(String[] args) {
		Parent_1 parent = new Child_1(); // �ڵ� Ÿ�� ��ȯ
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		// parent.field2 = "data2"; // �Ұ���
		// parent.method3(); // �Ұ���
		
		Child_1 child = (Child_1) parent;
		child.field2 = "data2"; // ����
		child.method3(); // ����
	}
}
