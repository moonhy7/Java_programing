package ch02_2_primitive;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 =3.14; <---컴파일 에러
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f; 
		double var5 = 0.1234567890123456789;
		// 출력할때 타입별 비트값에 의해 보장이 안되는 뒷부분  잘림
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3); 
		System.out.println("var4: " + var4); // var4: 0.12345679
		System.out.println("var5: " + var5); // var5: 0.12345678901234568
		//var5(double)이 var4(float)보다 두 배 이상 더 정밀하다.
		
		//e 사용하여 표현
		double var6 = 3e6; // 3.0 * 10^6
		float var7 = 3e6F; // 3.0 * 10^6
		double var8 = 2e-3; //2.0 * 10^(-3)
		// 0.0000000...00000003 등의 형태로 쓰면 0의 갯수를 세기도 불편함
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		

	}

}
