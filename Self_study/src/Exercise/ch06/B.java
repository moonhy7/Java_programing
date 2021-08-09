package Exercise.ch06;

public class B { 
	// 필드
	A a1 = new A(true); // public은 어디서나 접근 가능
	A a2 = new A(1); // default는 같은 패키지이므로 접근 가능
//	A a3 = new A("문자열"); // private은 같은 패키지이지만 클래스가 다르므로 접근 불가
}



