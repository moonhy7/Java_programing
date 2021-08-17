package ch12_1_mlti_thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		// 이 코드를 실행하는 스레드 객체 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		// ThreadA 객체 생성
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		// ThreadB 객체 생성
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadB.start();
	}
}
