package ch06_5_instance_static;

public class Calculator {

	// ÇÊµå
	static double pi = 3.141592;
	int x;
	int y;
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
}