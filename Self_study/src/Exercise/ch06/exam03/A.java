package Exercise.ch06.exam03;
 
public class A { 
	// �ʵ�
	A a1 = new A(true); 
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	// ������
	public A(boolean b) {} // public ���� ����
	A(int i) {} // default ���� ����
	private A(String s) {} // private ���� ����
}



