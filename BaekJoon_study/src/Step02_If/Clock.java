package Step02_If;

import java.util.Scanner;

public class Clock {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int H = scn.nextInt();
		int M = scn.nextInt();	
		int totalMinute = H * 60 + M;
		int changeMinute = 0;
		
		if(totalMinute < 45) {
			changeMinute = totalMinute + 24*60 - 45;
		} else {
			changeMinute = totalMinute - 45;
		}
		
		int changeH = changeMinute / 60;
		int changeM = changeMinute % 60;
		System.out.println(changeH + " " + changeM);
	}
}
