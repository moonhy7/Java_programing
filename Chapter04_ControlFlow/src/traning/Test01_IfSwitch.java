package traning;

public class Test01_IfSwitch {
	public static void main(String[] args) {
		// �̰Ÿ� if �ѹ���...
		int number = 120;
		if(number > 0 && (number%2) == 0) {
			System.out.println("��� �̸鼭 ¦��\n");
		}
		
		// if������..
		int n = 24;
		if(n>=0 && n<10) {
			System.out.println("0 �̻� 10 �̸��� ��");
		}
		else if(n>=10 && n<20) {
			System.out.println("10 �̻� 20 �̸��� ��");
		}
		else if(n>=20 && n<30) {
			System.out.println("20 �̻� 30 �̸��� ��");
		}
		else {
			System.out.println("���� Ȥ�� 30 �̻��� ��");
		}
		
		
		// switch������..(ù��° Ǯ��)
		switch(n) {
		case 20: case 21: case 22: case 23: case 24: 
		case 25: case 26: case 27: case 28: case 29:
		case 30:
			System.out.println("20 �̻� 30 �̸��� ��");
			System.out.println();
		}
		// -> �ʹ� �밡���� ������ ���.
		
		
		// switch������..(�ι�° Ǯ��) 
		// �̷��Ե� Ǯ���ֱ��� �ϴ� ����
		n = (int)(Math.random()*100);
		int num = n / 10;
		
		switch(num) {
		case 0:
			System.out.println(n +"�� 0 �̻� 10 �̸��� ��");
			break;
		case 1:
			System.out.println(n +"�� 10 �̻� 20 �̸��� ��");
			break;
		case 2:
			System.out.println(n +"�� �̻� 30 �̸��� ��");
			break;
		default:
			System.out.println(n +"�� ���� Ȥ�� 30 �̻���  ��");
		}	
	}
}
