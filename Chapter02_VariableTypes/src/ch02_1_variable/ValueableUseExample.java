package ch02_1_variable;
//p.53
public class ValueableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		
		
		
		int minute =5;
		System.out.println(hour + "�ð� " + minute +"��");
//							3	      �ð�		5	      ��
//					���ڿ� : "3" + "�ð�" = "3�ð�"
//										  "5��"
		System.out.println(3+3);
		System.out.println("3"+3); // 6�ƴ�
//						"3"+"3" = "33"

		int totalMinute = (hour*60) + minute;
//						   (3 * 60)
//							180		+	 5
		System.out.println("�� " + totalMinute + "��");
	}

}
