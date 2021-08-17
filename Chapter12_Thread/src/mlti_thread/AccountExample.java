package mlti_thread;

class Withdrawer implements Runnable {
	Account account = new Account();
	
	@Override
	public void run() {
		// ����ϱ�
		while(account.getBalance() > 0) {
			// 100, 200, 300�� �� ���Ƿ� ���
			int money = (int)(Math.random() * 3 + 1) * 100;
			account.withdraw(money);
			System.out.println("�����ܰ�: " + account.getBalance());
		}
	}
}

public class AccountExample {
	public static void main(String[] args) {
		/*
		 * ����ϴ� ���� ����ȭ(��Ƽ ������ ����)
		 */
		Runnable withdrawer = new Withdrawer();
		
		Thread jworker = new Thread(withdrawer);
		Thread yworker = new Thread(withdrawer);
		
		jworker.start();
		yworker.start();
	}

}
