package ch05_1_reference_variavle;

public class StringEqualsExample {
	public static void main(String[] args) {
		System.out.println("a");
		System.out.println("b"); // Unreachable code 에러 발생
//		return;
		
		System.out.println("Hello");
		System.out.println("Hello".toString()); //같은 결과 출력
//		System.out.println(0x3BCD.toString()); 이런 의미임
		System.out.println();
		
		
		String str1 = "java";
		// string타입은 4바이트로 정해져있음
		// 긴 문자열(값)이 저장되기엔 부족하다 
		// 주소만 담기는 것이다!
		// 힙영역에 java가 생성되는것임! string객체 의 멤버가 됨
		// 그 java라고 저장된 위치(주소)를 스택영역에 저장함
		
		String str2 = "java"; // 힙 영역에 또 추가?? no no
		// 100개 선언한다고 100개 다 만들어내면 그건 메모리 낭비
		// str1의 주소를 참조해서 꺼내오라고함
		// 똑같은 주소를 리턴해줌
		
		System.out.println(str1 == str2); 
		// true ->같은 주소에 있음을 알 수 있음
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // 같은 값 나옴
		
		String str3 = new String("java");
		// 스트링이 클래스니까 그러면 다 그냥 new 쓰면 되지 왜 굳이
		// String str2 = "java"; 이렇게도 가능하게 해놔서
		// 어렵게 만들었을까! 
		// new하면 힙영역에 계에속 만들어지게됨
		// 그래서 문자열은 자주 나오니 그냥 이렇게 해놓자~ 정한것임
		
		String str4 = new String("java");
		System.out.println(str3 == str4); //false나옴
		// 똑같은 아파트에 똑같은 호수냐? 놉
		// new로 생성한건 주소가 다름
		System.out.println(str2.contentEquals(str4)); //true
		// 주소는 다르지만 그 내용은 같음
		// 쇼파가 있냐? 예스 (주소는 달라도 쇼파가 있음은 같음)
		System.out.println(str2.contentEquals(str4)); //true
		
		System.out.println(str2 == str3); //false
		System.out.println();
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		//str1과 2는 같지만 나머지는 다다름
		
		//실무에서는 이렇게 선언해준다.
		// String str1 = "java";
		
		// 예제 시작
		
		System.out.println("\nString을 그냥 변수타입으로 사용했을때");
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		System.out.println("\nString을 New 방법으로 사용했을때");
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
	
		//클래스 선언 구조 예시
		ABC a1 = new ABC();
//		a1.	
	}
}
	class ABC {	
		int a, b;
		
}
	
	
	
	
