package mlti_thread;

public class Account {
	// �ܰ�
	private int balance = 10_000;
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money ) {
		if(balance >= money) {
			try {
				Thread.sleep(1 * 100);
			} catch (Exception e) {}
			balance -= money;
		}
	}
}
