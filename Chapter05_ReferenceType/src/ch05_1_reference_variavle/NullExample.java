package ch05_1_reference_variavle;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "";
		String str2 = null;
		System.out.println(str1 == str2);
		
		
		A a1;
		
		a1 = new A(); //이걸 까먹지마라!!
		System.out.println(a1.a);
		System.out.println(a1.b); 
		// 우리는 new를 항상 까먹고 이렇게 다이렉트로 쓰는 실수를 함
		System.out.println("프로그램 종료");
	}
}
class A {
	int a = 1;
	int b = 2;
}
