package ch06_ex_bank;

/*
 * 은행계좌 기능 구현 클래스
 * @author bitcamp
 * 
 */

//class BankAccount {
//	String name;
//	int balance;
//	int number;
//	int ssn;
//}

public class BankAccountPOP2 {
	
	// 에러 balance cannot be resolved to a variable 해결하는법
	static int balance;
	
	public static void main(String[] args) {
		// 계좌 잔고 초기화
		int balance = 0;
		
		// -> 계좌 입금 하기
		deposit(10000);
		
		// -> 계좌 출금 하기
		withdraw(3000);
		
		// ->계좌 잔고 출려가기
		checkBalance();
		
		withdraw(1000);
		deposit(30000);

	}
	
	private static void checkBalance() {
		System.out.println("현재잔고: " + balance);
		
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;
		
	}

	private static void deposit(int depositAmount) {
		balance = balance + depositAmount;
	}
	
	
}
