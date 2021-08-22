package object;

public class HashCodeOrg {
	public static void main(StringExample[] args) {
		StringExample str1 = new StringExample("abc");
		StringExample str2 = new StringExample("abc");
		
		StringExample str3 = "Hello";
		StringExample str4 = "Hello";
		
		System.out.println(str1 == str2);
		System.out.println("abc" == "abc");
		
		/*
		 * String 클래스는 문자열의 내용이 같으면, 동일한 해시코드를 
		 * 반환하도록 오버라이딩 되어있다.
		 */
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		/*
		 * Object 클래스의 hash챙ㄷ()와 동일
		 * 객체의 주소값으로 해시코드를 생성 
		 */
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}
}
