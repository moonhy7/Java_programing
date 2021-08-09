package ch06_5_instance_static;

public class Singleton {

	//����ƽ �ʵ�
	private static Singleton ref = new Singleton();
	
	//private ������
	//������ ȣ�� �ȵǵ���..
	private Singleton() {}
	
	//����ƽ �޼ҵ�
	static Singleton getInstance() {
		return ref;
	}
}