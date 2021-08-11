package ch10_3_example;

public class Program2 {
	public static void main(String[] args) {

		
		
		try {
			lib.write();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");	
	}
}

class lib {
	public static void write() throws InterruptedException {
		Thread.sleep(1000);
	}
}
