package Exercise;

public class Car2 {
	//�ʵ�
	int gas;
	int a;
	
	//������
	Car2() {
		a = 10; // �ν��Ͻ� �ʵ�� �����ڿ��� �ʱ�ȭ ����
	}
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas����");
			return false;
		}
		else {
			System.out.println("gas����");
			return true;
		}
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gas�ܷ� : " + gas);
				gas--;
			}
			else {
				System.out.printf("���� (gas�ܷ� : %d)\n",gas);
				return;
			}
		}
	}

}
