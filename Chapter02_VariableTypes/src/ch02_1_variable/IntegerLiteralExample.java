package ch02_1_variable;
public class IntegerLiteralExample {
	public static void main(String[] args) {
//			[자료형]
//		int -> char
		int var1 = 65;
		char var2 = 65;
		
		char var3 = 'C'; //----> 67 인코딩
		 
		System.out.println(var1);	//65
		System.out.println((char)var1);	//A
		System.out.println(var2);	//A
		System.out.println(var3);	//C
		System.out.println(var1+2);	//67 --> 'C' 디코딩
		
		int 	d1 = 3;
		double	d2 = 3;
		
		System.out.println(d1);	//3
		System.out.println(d2);	//3.0
		
		//	클래스
		IntegerLiteralExample be = new IntegerLiteralExample();
		//	자료형
		
		int var11 = 0b1011;	//11
		int var22 = 0206;	//134	
		int var33 = 365;	//365
		int var44 = 0xb3;	//179
		
		System.out.println("var1: " + var11);
		System.out.println("var2: " + var22);
		System.out.println("var3: " + var33);
		System.out.println("var4: " + var44);
	
		
	}

}
