package traning;

public class Test02_WhileDoWhile {
	public static void main(String[] args) {
		// while(). do~while();
		// 1~100 출력하고 거꾸로 100~1 출력
		
		int num = 1;
		
		while(num<=100) {
			System.out.print(num++ +" ");
		} 
		System.out.println();
		
		do {
			System.out.print(--num + " ");
		} while(num>=1);
		
		
		
		
		
		
		
	}
}
