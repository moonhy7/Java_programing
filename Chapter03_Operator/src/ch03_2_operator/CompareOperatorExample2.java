package ch03_2_operator;

public class CompareOperatorExample2 {
	public static void main(String[] args) throws InterruptedException {
		int a1 = 1;
		double a2 = 1.0;
		System.out.println(a1 == a2); //true
		
		double a3 = 0.1;
		float a4 = 0.1f;
		System.out.println(a3 == a4);  //false
		System.out.println((float)a3 == a4); //true
		 
		
		String strVar1 = "���"; 
		String strVar2 = "���";
		System.out.println(strVar1 == strVar2); // �̷��� �����������
		System.out.println(strVar1.equals(strVar2)); //true
	}
}
  