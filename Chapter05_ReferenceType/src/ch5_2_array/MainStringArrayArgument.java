package ch5_2_array;

public class MainStringArrayArgument {
	public static void main(String[] args) { //kor 담김
		// 위 메인문의 존재이유 :
		// 실행 시 특정 조건에 따른 실행을 명령하고 싶을 때..
		// 예를 들어 메모장에서 영어는 영어대로, 한글은 한글대로 짜는게 가능할까
		// 이미 실행시작할때 다 잘 짜여져있음
		
//		String version ="";
//		if(args != null) {
//			version = args[0];
//			if(version.equals("kor")) {
//				System.out.println("안녕하세요~ " + args[1]);
//			} else {
//				System.out.println("Hello~ " + args[1]);
//			}
//		}
//		
		int var = add(7,3);
		System.out.println(var);
		


		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			// System.exit(0); // 프로그램 강제 종료
			return; // 길이가 짧아서 메인 문 빠져나감
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("합: " + result);
	}

	private static int add(int i, int j) {
		return 0;
	}
	
	
}
