package ch10_1_exception_class;

class Person {}

public class NullPointExceptionExample_me {
	int x;
	int y;
	boolean b;
	Person p; // p는 Null로 초기화됨 
	
	public static void main(String[] args) {
		String data1 = "";
		System.out.println(data1.toString()); // 아무것도 출력이 안됨
		System.out.println(data1.length()); // 0
		
		String data3 = " ";
		System.out.println(data3.toString()); // 띄어쓰기가 출력됨
		System.out.println(data3.length()); // 1
		
		String data2 = null; // String data; 라고 선언(자동으로 null로 초기화됨)한 것과 같은 코드임
		System.out.println(data2.toString()); //에러 발생
		System.out.println(data2.length()); //에러 발생
		
		System.out.println("프로그램 종료");
	}
}
