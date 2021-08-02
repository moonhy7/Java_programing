package ch02_4_console_in_out;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws IOException{ 
		
		Scanner scan = new Scanner(System.in);
		scan.hasNextLine();
		 
//		System.out.println("프로그램이 정상적으로 종료되었습니다.");

		String inputData;
//		scanner 클래스에 설계된 데이터,메소드 등이 메모리에 세팅됨
//		이게 바로 instance 객체!! 이제 써먹을수있게됨
//		new를 꼭 써줘야하는 이유 : instance를 해줘야되서
//		나중에 클래스 할때 자세히 배움
		
		while(true) {
			inputData = scan.nextLine(); //구조 암기..하기
			System.out.println("입력된 문자열:" + inputData);
			if(inputData.equals("q")) {
				break;
			}		
		}
		System.out.println("종료");
	}
}
