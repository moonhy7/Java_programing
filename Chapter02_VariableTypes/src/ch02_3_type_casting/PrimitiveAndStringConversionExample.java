package ch02_3_type_casting;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
//			[실무에서 많이 쓰이는 강제타입변환]
//		"문자열" -------> 숫자 //이건 방금 배움
//			   <------- //이것도 가능해야됨
		
		String str = "100";
		int    var = 100;
		
//		str = str + 1;
//		var = var + 1;
		System.out.println(str);
		
		var = Integer.parseInt(str);
		System.out.println(str + 1);
		
//		숫자 <------문자열
		int value = Integer.parseInt("123456") + 1; // 123457
		
//		문자열 <-------- 숫자
		String number = "1234";
		
		System.out.println(number + 5); // "12345"
		System.out.println(value);
		
		
		
//		문자열 <-------- 숫자
		String str_1 = Integer.toString(value) + "8"; // 1234578
		str_1 = String.valueOf("100" + 1);
		
		System.out.println(str_1);
		
		
//		요약!
//		정수/정수 = 깨름찍해야됨! , 더블타입으로 항상!
//		
		
		
		
//		예제 시작
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		
		
		
	}
}
