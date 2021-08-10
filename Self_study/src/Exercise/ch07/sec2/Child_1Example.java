package Exercise.ch07.sec2;

public class Child_1Example {
	public static void main(String[] args) {
		Parent_1 parent = new Child_1(); // 자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		// parent.field2 = "data2"; // 불가능
		// parent.method3(); // 불가능
		
		Child_1 child = (Child_1) parent;
		child.field2 = "data2"; // 가능
		child.method3(); // 가능
	}
}
