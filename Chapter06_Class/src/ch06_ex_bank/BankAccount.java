package ch06_ex_bank;

public class BankAccount {
	// 필드
	String name;
	String number;
	int balance;
	
	// 생성자
	public BankAccount(String name ) {
		this(name,"123-456",0);
	}
	
	public BankAccount(String name, String number) {
		this(name,number,0);

	}
	
	public BankAccount(String name, String number, int balance) {
		this.name =name;
		this.number = number;
		this.balance = balance;
	}
	
	// 메소드
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	public void checkBalance() {
		System.out.println(this.name + "계좌의 현재잔고: " + balance);
	}
	
}
