package ch06_ex_bank;

/*
 * ������� ��� ���� Ŭ����
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
	
	// ���� balance cannot be resolved to a variable �ذ��ϴ¹�
	static int balance;
	
	public static void main(String[] args) {
		// ���� �ܰ� �ʱ�ȭ
		int balance = 0;
		
		// -> ���� �Ա� �ϱ�
		deposit(10000);
		
		// -> ���� ��� �ϱ�
		withdraw(3000);
		
		// ->���� �ܰ� �������
		checkBalance();
		
		withdraw(1000);
		deposit(30000);

	}
	
	private static void checkBalance() {
		System.out.println("�����ܰ�: " + balance);
		
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance - withdrawAmount;
		
	}

	private static void deposit(int depositAmount) {
		balance = balance + depositAmount;
	}
	
	
}
