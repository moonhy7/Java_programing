package ch06_ex_bank;

/*
 * ���� ���±�� ���� OOP
 * @author bitcamp
 * 
 */

public class BankAccountOOP {
	public static void main(String[] args) {
		BankAccount kimAccount = new BankAccount("kim");
		
		kimAccount.deposit(10000);
		kimAccount.withdraw(3000);
		kimAccount.checkBalance();
		
		BankAccount leeAcount = new BankAccount("lee","777-777", 100);
	
		leeAcount.deposit(10000);
		leeAcount.checkBalance();
	
	}
}
