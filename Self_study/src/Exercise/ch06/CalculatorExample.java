package Exercise.ch06;

public class CalculatorExample {
	public static void main(String[] args) {
		// static �޼ҵ带 �����ų�� ��Ģ������ Ŭ���� �̸����� �����ؾ��Ѵ�.
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10,5);
		int result3 = Calculator.minus(10,5);
		
		// ������ ��ü ���� �����ε� ������ �����ϴ�. ��� ǥ�ð� �߱� ��
		Calculator myCalc = new Calculator();
		double result4 = 10*10*myCalc.pi;
		int result5 = myCalc.plus(10, 5);
		int result6 = myCalc.minus(10,5);
		
		System.out.println("result1 : " + result1); // result1 : 314.159
		System.out.println("result2 : " + result2); // result2 : 15
		System.out.println("result3 : " + result3); // result3 : 5
		System.out.println("result4 : " + result4); // result4 : 314.159
		System.out.println("result5 : " + result5); // result5 : 15
		System.out.println("result6 : " + result6); // result6 : 5
		
//		Calculator myCarc = new Calculator();
//		myCarc.execute();
	}
}
