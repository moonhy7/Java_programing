package Exercise;

public class Car2 {
	//« µÂ
	int gas;
	
	//ª˝º∫¿⁄
	
	//∏ﬁº“µÂ
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gasæ¯¿Ω");
			return false;
		}
		else {
			System.out.println("gas¿÷¿Ω");
			return true;
		}
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gas¿‹∑Æ : " + gas);
				gas--;
			}
			else {
				System.out.printf("∏ÿ√„ (gas¿‹∑Æ : %d)\n",gas);
				return;
			}
		}
	}

}
