package Exercise;

public class SingletonExample {
	public static void main(String[] args) {
		// Singleton obj1 = new Singleton(); // �����Ͽ���
		// Singleton obj2 = new Singleton(); // �����Ͽ���
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}
}
