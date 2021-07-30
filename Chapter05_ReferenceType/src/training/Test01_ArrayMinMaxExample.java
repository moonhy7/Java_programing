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
		int[] arr = {1,2,3,4,5,6,7};
		minValue(arr);
		maxValue(arr);
	}
	
	public static int minValue(int[] arr) {
		int min = 100;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
}
