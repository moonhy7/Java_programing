package training;

public class Test01_ArrayMinMaxExample {
/*
 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된
 * 최대값, 최소값을 찾아서 반환하는 메서드를 가각 다음의 형태로 구현하시오
 * public static int minValue(int[] arr) : 최소값 반환
 * public static int maxValue(int[] arr) : 최대값 반환
 * 
 */
	
	public static void main(String[] args) {
//		어떤 1차원 배열 선언, 구현된 메서드 Call해서 사용하는 코드
		int[] arr = {11, 221, 13, 34, 95, 61, 71};
//					 |11|26|13|.|.|||||
		System.out.println("최소값: " + minValue(arr));
		System.out.println("최소값: " + maxValue(arr));

	}
	
	public static int minValue(int[] arr) {
		int minNum = arr[0]; // 초기값 설정하는 방법 (배열 내 임의의 원소로 설정)
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minNum) {
				minNum = arr[i];
			} 
		}
		return minNum;
	}
	
	public static int maxValue(int[] arr) {
		int maxNum = arr[0]; 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNum) {
				maxNum = arr[i];
			} // 삼항연산자로도 해보기
		}
		return maxNum;
	}
	
}
