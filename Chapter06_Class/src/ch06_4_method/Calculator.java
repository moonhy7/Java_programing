package ch06_4_method;

public class Calculator {
	public void powerOn () {
		System.out.println("������ �մϴ�.");
	}
	
	public int plus(int i, int j) {
		return i+j;
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
//	public double divide(byte i,byte j) {
//		return 0.0;
//	}
	
//	int i = (byte) 10;
	
	public double divide(int i, int j) {
		if(j==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		return (double)i / j;
	}
	
} 
