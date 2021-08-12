package object;

public class CloneOrg {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] arrCopy = arr.clone();
		for( int i : arrCopy) {
			System.out.print(i + ", ");
		}
	}
}
