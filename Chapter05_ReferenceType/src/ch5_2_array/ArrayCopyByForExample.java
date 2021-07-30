package ch5_2_array;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		// 배열복사가 필요한 이유
		// 원소를 하나 더 추가하고싶은데 이미 만들어진 방개수를 변경할 수 없으므로
		// 새로운 배열(방이 더 많음)에 복사를 해준다.
		// arraycopy()하면 원래 배열의 시작 주소 값을 새로운 배열에 넣어준다.
		// 
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
//		System.out.println(oldIntArray[0]);
//		oldIntArray[0] = 0;
//		System.out.println(oldIntArray[0]);
//		
//		oldIntArray[3] = 4;
		
		// 배열 복사
		for(int i=0; i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		oldIntArray = newIntArray;
		oldIntArray[3] = 4;
		oldIntArray[4] = 5;
		
		for(int i=0; i<oldIntArray.length; i++) {
			System.out.print(oldIntArray[i] + " ");
		}
		System.out.println();
		System.out.println("배열크기: ");
		
		
		
		
		
	}
}
