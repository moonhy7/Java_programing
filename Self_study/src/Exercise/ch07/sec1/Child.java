package Exercise.ch07.sec1;

public class Child extends Parent{
	//�ʵ�
	private int studentNo; 
	
	//������
	public Child(String name, int studentNo) {
		super(name); // name �ʵ带 ����Ϸ��� �θ��� �����ڸ� super()�� ���� ȣ���ؾ��Ѵ�.
		this.name = name;
		this.studentNo = studentNo;
	}
}
