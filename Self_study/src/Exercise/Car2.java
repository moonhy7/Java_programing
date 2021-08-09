package Exercise;

public class Car2 {
	//필드
	int gas;
	int a;
	
	//생성자
	Car2() {
		a = 10; // 인스턴스 필드는 생성자에서 초기화 가능
	}
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas없음");
			return false;
		}
		else {
			System.out.println("gas있음");
			return true;
		}
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gas잔량 : " + gas);
				gas--;
			}
			else {
				System.out.printf("멈춤 (gas잔량 : %d)\n",gas);
				return;
			}
		}
	}

}
