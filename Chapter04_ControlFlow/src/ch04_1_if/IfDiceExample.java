package ch04_1_if;

public class IfDiceExample {
	public static void main(String[] args) {
		System.out.println(Math.random()); // ���������� �ϳ� ���
		
		System.out.println(Math.random()); //0~1 ���� �Ǽ��� �������� ����
		
		int number= (int) (10 * (Math.random()));
		System.out.println(number);

//		0~9������ �� �� �������� �̱�
		System.out.println((int)(Math.random()*10));
		

//		1~10������ �� �� �������� �̱�
		System.out.println((int)(Math.random()*10 + 1));

//		1~100������ �� �� �������� �̱�
		System.out.println((int)(Math.random()*100 + 1));


//		�ֻ��� ������ (1~6)
		System.out.println((int)(Math.random()*6 + 1));
//		6�� ���ڸ� 6����, 10�� ���ڸ� 10������!!!
		
		
//		���� ����
		int num = (int) (Math.random() *6 + 1);

		if (num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		} else if (num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		} else if (num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		} else if (num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		} else if (num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		} else {
			System.out.println("6���� ���Խ��ϴ�.");
		} 
		
	}
}
