package ch05_1_reference_variavle;

public class JavaType {
	public static void main(String[] args) {
		int iv = 10;
		double dv = 10.0;
		
		System.out.println(iv);
		System.out.println(dv);
		
		// int형 1차원 배열 생성
		int[] arr0 = new int[2];
		int[] arr1 = new int[3];
		arr1[2] = 3;
		
		int[] arr2 = new int[2];
	
		System.out.println(arr0); // 주소 값이 들어있음
		System.out.println(arr1);
		System.out.println(arr2);
		
		// int형 1차원 배열을 갖는 배열 3개 짜리 2차원배열 생성
		int[][] arrs = new int[3][];
		
//		int[][] arrs = {arr0, arr1, arr2}; // 이렇게 만들고 싶음
		arrs[0] = arr0;
		arrs[1] = arr1;
		arrs[2] = arr2;
//		arrs[1][2] = 3; // 이건 당연히 되고 우리가 궁금한건
		
		// arr1[2] = 3; 이렇게 아까 써준 내부 배열을 바꿔도 반영이 되는지 확인 
		
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j] + ", ");
			}
		} System.out.println();
		
		// 책 - 상상된 for문?
		for(int[] elements : arrs) {
			for(int e : elements) {
				System.out.print(e + ", ");
			}
		}
	}
}
