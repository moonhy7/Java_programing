package ch06_4_method;

public class Car1 {
	//�ʵ�
	int gas;
	
	//������
	
	//�޼ҵ�
	// �������� �޼ҵ�
	void setGas(int gas) { // ���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
		this.gas = gas;
	} 
	// �����ܷ� ����
	boolean isLeftGas() { 
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	// ����
	void run() throws InterruptedException {
		while(true) {
			if(gas > 0 ) {
				System.out.printf("������~~~[gas: %d]\n",gas);
				gas--;
			} else {
				System.out.printf("����~!!!!~~[gas: %d]\n",gas);
				return; //�޼ҵ� ���� ����
			}
		}
	}
}
