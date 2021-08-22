package ch09_2_anonymous.anonymous_class;

class Parent {
	void parentMethod() {}
} // �θ� Ŭ���� ����

class Child extends Parent {} // �ڽ� Ŭ���� ����

// �� ����� ���� ��ü ���� - ������� ���
public class Example {
	
	// �ʵ��� �ʱⰪ���� �ڽ� ��ü�� ����
	Parent field = new Child();
	
	// ���� ������ �ڽ� ��ü�� ����
	void method() {
		Parent localVar = new Child();
	}
}

// ����� ���� ��ü ���� - �͸� ��ü�� ����ϴ� ���

class Example2 {
	// ��� 1. �ʵ� ����
	Parent field = new Parent() { // �θ� �����ڸ� ȣ���ϴ� �ڵ�
	    // �θ� Ŭ������ ����ؼ� �߰�ȣ �ȿ� �ִ� ����ó�� �ڽ� Ŭ������ �����Ѵٴ� �ǹ�
		int childField; // �ʵ峪 �޼ҵ弱��
		void childMethod() {}
		@Override // �θ� �޼ҵ带 ������
		void parentMethod() {
			childField = 3; // �͸� �ڽ� ��ü���� ���ǵ� �ʵ�� �޼ҵ��
			childMethod(); // �͸� �ڽ� ��ü �ȿ����� ��� ������
		} // ������ �͸� �ڽ� ��ü�� �θ� Ÿ�� ������ ���ԵǾ� �θ� Ÿ�Կ� ����Ȱ͸� ��� �����ϱ� ����
	};
	
	void method_cannot_use_anonymous() {
		// field.childField = 3; // �͸� �ڽ� ��ü �ܺο����� �ʵ峪 �޼ҵ� ��� �Ұ�
		// field.childMethod(); // parentMethod() ���ο����� ��� ����
		field.parentMethod(); // �θ� �޼ҵ� ȣ���� ����
	}
		
	// ��� 2. ���� ���� ���� (���1�� �������� �޼ҵ�ȿ��� �����Ѵٴ� �͸� �ٸ�)
	void method() {
		Parent localVar = new Parent() { 
			int childField;
			void childMethod() {}
			@Override
			void parentMethod() {} // �θ� �޼ҵ带 ������
		};
	}
	
	// ��� 3. �Ű� ������ �͸� ��ü ����
	void method1(Parent parent) {} // �Ű������� ���� �޼ҵ� ����
	void method2() { // method1()�� ȣ��
		method1( // method1()�� �Ű� ������ �͸� ��ü ����
			new Parent() {
				int childField;
				void childMethod() {}
				@Override
				void parentMethod() {}
			}	
		);		
	}
}

