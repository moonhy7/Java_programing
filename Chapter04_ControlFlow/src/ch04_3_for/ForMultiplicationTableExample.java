package ch04_3_for;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		for (int m=2;m<=9;m++) {
			System.out.println("\n*** " + m + "�� ***");
			for (int n=1; n<=9;n++) {
//				System.out.println( m + " x " + n + " = " + (m*n));
				System.out.printf("%d x %d = %d\n",m,n,(m*n));
			}
			
		}
		
		

	}
}
