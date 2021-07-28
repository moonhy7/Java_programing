package traning;

public class Test01_IfSwitch {
	public static void main(String[] args) {
		// 이거를 if 한번만...
		int number = 120;
		if(number > 0 && (number%2) == 0) {
			System.out.println("양수 이면서 짝수\n");
		}
		
		// if문으로..
		int n = 24;
		if(n>=0 && n<10) {
			System.out.println("0 이상 10 미만의 수");
		}
		else if(n>=10 && n<20) {
			System.out.println("10 이상 20 미만의 수");
		}
		else if(n>=20 && n<30) {
			System.out.println("20 이상 30 미만의 수");
		}
		else {
			System.out.println("음수 혹은 30 이상의 수");
		}
		
		
		// switch문으로..(첫번째 풀이)
		switch(n) {
		case 20: case 21: case 22: case 23: case 24: 
		case 25: case 26: case 27: case 28: case 29:
		case 30:
			System.out.println("20 이상 30 미만의 수");
			System.out.println();
		}
		// -> 너무 노가다인 느낌이 든다.
		
		
		// switch문으로..(두번째 풀이) 
		// 이렇게도 풀수있구나 하는 문제
		n = (int)(Math.random()*100);
		int num = n / 10;
		
		switch(num) {
		case 0:
			System.out.println(n +"은 0 이상 10 미만의 수");
			break;
		case 1:
			System.out.println(n +"은 10 이상 20 미만의 수");
			break;
		case 2:
			System.out.println(n +"은 이상 30 미만의 수");
			break;
		default:
			System.out.println(n +"은 음수 혹은 30 이상의  수");
		}	
	}
}
