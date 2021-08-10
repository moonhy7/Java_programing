package reviewProblem.ch03;

import java.util.Scanner;

public class Ch03_2 {
	public static void main(String[] args) {
		//1번
		byte b = 5;
//		b = -b; 에러//부호계산은 int여야함, byte는 양수만
		
		//5번
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = (double)var1 / var2; // 2.5
//		int var4 = (int)(var3 * var2); // 5
//		
//		//6번
//		int value = 356;
//		System.out.println((value/100)*100);
//		
		//7번
//		float var1 = 10f; // 10.0
//		System.out.println(var1); 
//		float var2 = var1/100; 
//		System.out.println(var2); // 0.1
//		System.out.println((double)var2); // 0.10000000149011612
//		System.out.println();
//		
		// 9번
		
//		Scanner scn = new Scanner(System.in);
//		System.out.print("첫 번째 수: ");
//		double x = Double.parseDouble(scn.next());
//		System.out.print("두 번째 수: ");
//		double y = Double.parseDouble(scn.next());
//		if(y==0 && y==0.0) {
//			System.out.println("결과: 무한대");
//		} else {
//			System.out.println("결과: " + (double)x/y);
//		}
		
		// 10번
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double pi = Double.parseDouble(var2 + "."+var3);
		double var4 = var1 *var1*Double.parseDouble(var2 + "."+var3);
		System.out.println("원의 넓이:" + var4); // 원의 넓이:314.0
		
		
		//11번
		Scanner scn = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scn.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scn.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) { // name == "java" 하면 틀림!
			if(password == 12345) {
				System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패: 패스워드가 틀림");
		}
	} else {
		System.out.println("로그인 실패: 아이디 존재하지 않음");
	}
		
		
		
		
	
		
	}
	
}
