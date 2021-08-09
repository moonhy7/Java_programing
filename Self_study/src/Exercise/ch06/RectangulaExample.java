package Exercise.ch06;

public class RectangulaExample {
	public static void main(String[] args) {
		Rectangular myRec = new Rectangular();
		double r1 = myRec.rec(3);
		double r2 = myRec.rec(3, 5);
		System.out.println("정사각형 넓이는 : " + r1);
		System.out.println("직사각형 넓이는 : " + r2);
		
	}
}
