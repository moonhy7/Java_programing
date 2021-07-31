package Step04_while;

import java.util.Scanner;

public class Cycle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int originNum = sc.nextInt();
		int firstNum = 0;
		int secondNum = 0;
		int num = originNum;
		int count = 0;
		while(true) {
			if(num<10) {
				firstNum = num;
				secondNum = num;
			} else {
				int afterNum = num/10 + num%10;
				firstNum = num % 10;
				secondNum = afterNum % 10;
			} num = firstNum*10 + secondNum; 
			count++;
			if(num==originNum) {
				break;
			}
		} System.out.println(count);
	}
}
