package reviewProblem;

import java.io.IOException;
import java.util.Scanner;

public class Ch04_2 {
	public static void main(String[] args) throws IOException {
		
		// 2번
		int sum = 0;
		for(int i=1; i<=100;i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum); // 1683
		
		
		// 3번
		while(true) {
			int diceNum1 = (int)(Math.random()*6+1);
			int diceNum2 = (int)(Math.random()*6+1);
			System.out.printf("(%d,%d) ",diceNum1,diceNum2);
			if(diceNum1+diceNum2 == 5) {
				break;
			} 
		}
		System.out.println();
		
		
		// 4번
		for(int x=0; x<=10; x++) {
			for(int y=0;y<10;y++) {
				if(4*x + 5*y==60) {
					System.out.printf("(%d,%d) ",x,y); // (5,8) (10,4) 
				} 
			}
		}
		
		
		
		
		
		// 5번
		for(int i=1; i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		// 6번
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 7번
		boolean run = true;
		int balance =0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.충금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			
			switch(num) {
			case 1: 
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
				
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
	
			}	System.out.println();
		}	System.out.print("프로그램 종료");
			
	}
}

