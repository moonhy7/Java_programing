package ch02_3_type_casting;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
//			[실무에서 많이 쓰이는 강제타입변환]
		
//		문자열 -------> 숫자   //이건 위에 표 참고
//		문자열 <------- 숫자 //이것도 가능해야함
		
		String str = "100";
		int    var = 100;
		
		str = str + 1;
		System.out.println(str); // 1001
		
		var = var + 1;
		System.out.println(var); // 101
		
		var = Integer.parseInt(str); 
		System.out.println(var); // 1001
		System.out.println(str + 1); // 10011
		
//		숫자 <------문자열
		int value = Integer.parseInt("123456") + 1; 
		System.out.println(value); // 123457
		
//		문자열 <-------- 숫자
		String number = "123456";
		System.out.println(number + 1); // 1234561
			
		
//		문자열 <-------- 숫자
		String str_1 = Integer.toString(value) + "8"; 
		System.out.println(str_1); // 1234578
		str_1 = String.valueOf("100" + 1); 
		System.out.println(str_1); //1001
		
//		예제 시작
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1); //value1: 10
		System.out.println("value2: " + value2); //value2: 3.14
		System.out.println("value3: " + value3); //value3: true
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1); //str1: 10
		System.out.println("str2: " + str2); //str2: 3.14
		System.out.println("str3: " + str3); //str3: true

	}
}
