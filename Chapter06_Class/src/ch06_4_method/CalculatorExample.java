package ch06_4_method;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		// 계산기 켜기
		myCalc.powerOn();
		
		// 계산하기
		int var1 = myCalc.plus(8,8);
		System.out.println("var1 : " + var1);
		double var2 = myCalc.divide(4, 8);
		System.out.println("var2 :" + var2);
		
		byte x = 10;
		byte y = 4;
		double var3 = myCalc.divide(x,y);
		System.out.println("var3 : " + var3);
				
		// 계산기 끄기
		myCalc.powerOff();
	}
}
 