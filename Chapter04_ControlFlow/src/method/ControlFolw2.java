package method;

public class ControlFolw2 {
//	public static void main(String[] args) {
		//�밡�� ���
//		int a = 1;
//		int b = 5;
//		int c = a + b;
//		System.out.println(c);
//		
//		a = 11;
//		b = 22;
//		c = a+b;
//		System.out.println(c);
//		
//		a = 33;
//		b = 55;
//		c = a+b;
//		System.out.println(c);
		

//		main������ �̷��� �������� ������ ���� ������?
//		add(1,5);
//		add(11,22);
//		add(33,55);
//	}	
//}
	
	
	public static void main(String[] args) {
		// "�����ε�"
		add1(1,5);
		add1(11,22);
		add1(33,55);
		add2(1.5,3.1);
		
		int result = add3(1,2);
		
		System.out.println(result);
	}
	
	public static void add1(int i, int j) {
		System.out.println(i+j);
	}
	

	public static void add2(double i ,double j) {
		System.out.println(i + j);
	} //void�� ������ �ȹ޴±��� 
	
	//���� Ÿ���� �� ���־����
	public static int add3(int i, int j) {
		return i + j;
	}
	
	
	// �����ε��� ����,�޴� ��� ���������鼭
	// ���� ���ϴ°� ����
}
