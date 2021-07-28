package ch02_2_primitive;

public class ByteExample {

	public static void main(String[] args) {
		
		int a = 031; // 3*8+1=25
		int b = 0b000000000000000000011; // 3
		int c = 0x0f; // 15*1 = 15
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128; //컴파일 에러
//		에러 설명 : Type mismatch: cannot convert from int to byte
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

		
		
	}

}
