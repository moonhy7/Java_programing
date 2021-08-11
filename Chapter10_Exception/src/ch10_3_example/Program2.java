package ch10_3_example;

public class Program2 {
	public static void main(String[] args) {
		
		// 예외 처리
		try { 
			lib.write(); //write() 메소드 실행
		} catch (InterruptedException e) { // 예외 발생되면 e로 예외를 받아오기
			e.printStackTrace(); // e 예외 내용을 출력하기
		}
		System.out.println("프로그램 종료");	
	}
}
// 라이브러리 클래스
class lib { 
	public static void write() throws InterruptedException { // InterruptedException 예외가 발생하면 던지기
		Thread.sleep(1000); // 1초 대기하기
	}
}
