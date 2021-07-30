package ch5_3_enumeration;

import java.util.Calendar;
import java.util.Scanner;
//import java.lang; 이런식으로 print문도 써주어야하는데 안적는 이유!
// 자바 랭 패키지에 있는것들은 워낙 많이 쓰다보니 안적음

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance(); // <-위에 임포트해주는 애
//		Scanner scan = new Scanner(System.in); <- 위에 임포트 대표적인것
//		System.out.println(); <- 얘는 왜 안해줘도될까? 이유는 위에
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 6:
			today = Week.FRIDAY; break;
		}
		System.out.println("오늘 요일: " + today);
		
		
	}
}
