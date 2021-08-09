package Exercise;

public class Singleton {
	// ���� �ʵ�
	// Ÿ���� �ڱ��ڽ�(Ŭ����)�� ���� �ʵ� �����ϰ� ��ü �����Ͽ� �ʱ�ȭ 
	private static Singleton singleton = new Singleton();
	
	// ������
	// �ٸ� Ŭ�������� ��ü�� �߰��� �������� ���ϵ��� private�� ����
	private Singleton() {}
	
	// ���� �޼ҵ�
	// Ÿ���� Ŭ���� �ڱ� �ڽ��̰� return�����δ� �����ϰ� �ִ� �ڽ��� ��ü�� �������ش�.
	static Singleton getInstance() {
		return singleton;
	}
 }
