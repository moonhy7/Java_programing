package ch02_1_variable;
//p.53
public class ValueableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		
		
		
		int minute =5;
		System.out.println(hour + "시간 " + minute +"분");
//							3	      시간		5	      분
//					문자열 : "3" + "시간" = "3시간"
//										  "5분"
		System.out.println(3+3);
		System.out.println("3"+3); // 6아님
//						"3"+"3" = "33"

		int totalMinute = (hour*60) + minute;
//						   (3 * 60)
//							180		+	 5
		System.out.println("총 " + totalMinute + "분");
	}

}
