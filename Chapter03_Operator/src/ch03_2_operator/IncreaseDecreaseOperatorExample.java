package ch03_2_operator;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++;
		++x;
		System.out.printf("x= %d\n", x); // x = 12
		
		System.out.println("--------------------");
		y--;
		--y;
		System.out.printf("y= %d\n", y); // y = 8
		
		System.out.println("--------------------");
		z = x++;
		System.out.printf("z= %d\n", z); // z = 12
		System.out.printf("x= %d\n", x); // x = 13
		 
		System.out.println("--------------------");
		z = ++x;
		System.out.printf("z= %d\n", z); // z = 14
		System.out.printf("x= %d\n", x); // x = 14
		
		System.out.println("--------------------");
		z = ++x + y++;		
		System.out.printf("z= %d\n", z); // z = 15 + 8 = 23
		System.out.printf("x= %d\n", x); // x = 15
		System.out.printf("y= %d\n", y); // y = 9
	}
}
