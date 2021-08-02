package ch05_1_reference_variavle;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "";
		String str2 = null;
		System.out.println(str1 == str2);
		
		A a1;
		a1 = new A(); // 이 구조 중요
		// new ~로 쓰는 거 자주 까먹으니 주의할 것
		
		System.out.println(a1.a);
		System.out.println(a1.b); 
		System.out.println("프로그램 종료");
	}
}
class A {
	int a = 1;
	int b = 2;
}
