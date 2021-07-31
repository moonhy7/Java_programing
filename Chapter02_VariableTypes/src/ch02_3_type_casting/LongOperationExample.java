package ch02_3_type_casting;

public class LongOperationExample {

	public static void main(String[] args) {
		
//		
// result = num1	(+ - / * %)	num2;
// result = [long] num1 (+ - / * %)	[byte,char,short,int] num2;
	
		
//		[예제 시작]

		byte v1 = 10;
		int v2 = 100;
		long v3 = 1000L;
		long result = v1 + v2 + v3;
//			result = v1 + v2 + v3;
//					byte  int long
//					    int   long
//						long  long
//							long
		System.out.println(result); // 1110
	

		
		
 	//2.5
 	 double result1 = 10 / 4; // 2.0
 	 double result2 = (double)10 / 4; // 2.5
 	 double result3 = (double)10 / (double)4; // 2.5
 	 
 	 // 성적입력관리시스템
// 	 총점 sum
// 	 평균 avg = sum  학생수;
 	 
 	 System.out.println(result1);
 	 System.out.println(result2);
 	 System.out.println(result3);
 
 
		
		
		
 
	}

}
