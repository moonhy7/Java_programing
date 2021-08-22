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
		 * String Ŭ������ ���ڿ��� ������ ������, ������ �ؽ��ڵ带 
		 * ��ȯ�ϵ��� �������̵� �Ǿ��ִ�.
		 */
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		/*
		 * Object Ŭ������ hashì��()�� ����
		 * ��ü�� �ּҰ����� �ؽ��ڵ带 ���� 
		 */
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}
}
