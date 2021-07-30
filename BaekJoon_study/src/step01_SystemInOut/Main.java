package step01_SystemInOut;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) {
		//1번
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		//2번
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		//3번
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");

		//1번
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int result1 = n2 / 100; //3
		int temp1 = n2 % 100; //85
		int result2 = temp1 / 10; //8
		int temp2 = temp1 % 10; //5
		
		System.out.println(n1 * temp2);
		System.out.println(n1 * result2);
		System.out.println(n1 * result1);
		System.out.println(n1 * n2);

		//2번
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A>B) {
			System.out.println(">");
		}
		else if(A<B) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}	

		
	}
}
