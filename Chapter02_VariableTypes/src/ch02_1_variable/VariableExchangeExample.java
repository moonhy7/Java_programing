package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
//		[������ �Ҵ�� �� ������]
		int x = 3;
		int y = 5;
//		x = 3, y = 5
		
		System.out.println("x:" + x + ", y:" + y);
//		x:3, y:5
		
//		�Ʒ�ó�� �ϸ� �ȵ�. 3�� �����. ��3�� ���� temp�� �ʿ��� ������
//		x = y;	// x : 5
//		y = x;	// y : 5
		
		int temp = x;	// 3
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		System.out.println();
		
//		[������ �Ҵ�� �� ������ �ٽ� �غ��� (�ȵǴ� ����)]
		int a = 100;
		int b = 200;
//		a = 100, b = 200
		System.out.println("a�� ��: " + a);
		System.out.println("b�� ��: " + b);
		
		a = b;
		System.out.println("a=b, a�� ��: " + a);
		System.out.println("a=b, b�� ��: " + b);

		b = a;
		System.out.println("b=a, a�� ��: " + a);
		System.out.println("b=a, b�� ��: " + b);
		
//		[������ �Ҵ�� �� ������ �ٽ� �غ��� (�ߵǴ� ����)]
		int c = 100;
		int d = 200;
		int temp2;
//		c = 100, d = 200
		
		temp2 = c;	// 100
		
		c = d; // 200
		System.out.println("c�� ��: " + c);
		System.out.println("d�� ��: " + d);
		
		d = temp2;	// temp2 = 100
		System.out.println("c=d, c�� ��: " + c);
		System.out.println("c=d, d�� ��: " + d);
		
//		c:3, d:5
		System.out.println("c="+ c + ", d=" + d);

		
	}
}
