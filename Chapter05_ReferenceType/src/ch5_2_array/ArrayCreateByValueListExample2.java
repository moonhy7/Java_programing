package ch5_2_array;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		
		// scores 같은 배열을 여러개 선언해야할 경우는 이렇게 따로 메소드 만들어주고 해주는게 좋음
		// 코드중복은 줄이고 재사용성은 높이는게 원칙
//		int sum2 = add(new int[] {83, 90, 87});
		// new int[] {83, 90, 87} 이 작업은 힙메모리에 생성된다는것
		// 주소값을 리턴한다는 말
		// 이 줄에서 주소를 add메소드로 보냄 
		
		
		int sum2 = add(/*0xBC123*/ new int[] {83,90,87});
		System.out.println("총합 : " + sum2);
		System.out.println();
		
		
		int[] arr = new int[] {75,70,65} ;
		int sum3 = add(arr);
		System.out.println("총합 : " + sum3);
		System.out.println();
		}

	private static int add(int[]/*타입*/ scores /*배열의 참조변수임 주소를 받음*/) {
		// score 에 해당 주소를 받아오는것
		// 그 주소에서 데이터 가져와서 계산하는것임
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
