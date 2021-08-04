package ch07_1_inheritance;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원면적 : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
//		System.out.println("원면적: " + com.areaCircle());
	
	}
}
