package object;

import bitcamp.common.BizNegativeNumberException;
import bitcamp.common.BizThousandOverException;
import bitcamp.common.Calculator;

class MyClass {}


public class Program {
	public static void main(StringExample[] args) {
		Object o1 = new MyClass();
		
		int var = 1;
		System.out.println(var);
		
		Integer var2 = new Integer("1");
		System.out.println(var2.intValue());
		
		try {
			Calculator.add(100000, 0);
		} catch(BizThousandOverException e) {
			System.out.println(e.toString());
		} catch (BizNegativeNumberException e) {
			System.out.println(e.toString());
		}
	}
}
