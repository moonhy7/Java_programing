package Exercise;

public class Car2 {
	//�ʵ�
	int gas;
	
	//������
	
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
