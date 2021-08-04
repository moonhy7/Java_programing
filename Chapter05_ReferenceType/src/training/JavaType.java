package training;

public class JavaType {
	public static void main(String[] args) {
		String[][][][][][] 대한민국;
//		String[][][][][][] 대한민국 = {서울, 부산, 대구, 인천, ...};		
//									  |
//									  V
//									{강남구, 김포구, 강북구, 성북구, ...}
//									  |
//									  V
//									{신사동, 역삼동, ...}
//									  |
//									  V
//									{현대, 삼성, 대우, ...}
//									  |
//									  V
//									{101동, 102동, 103동, ...}
//									  |
//									  V
//									{101호, 102호, 103호, ...}	
		
//	 대한민국 [0][0][0][0][0][0] = 서울 강남구 신사동 현대아파트 101동 101호	
		
		// 6차원 배열
		
		// 1차원 배열의 주소값을 또 배열로 만들어서
		
		//1차원 배열을 참조하고 있는 참조변수의 1차원 배열이다.!
		
		int i =33;
		System.out.println(i); //33
		String[] strs = {"korea","fighting"};
		System.out.println(strs);
		System.out.println(strs[0]);
		
		// int[3][2] arrs = {  O   O   O  };
		//					    ㅁㅁ  ㅁㅁ  ㅁㅁ  (2차원배열을 3개 만든다!)
		
	}
}
