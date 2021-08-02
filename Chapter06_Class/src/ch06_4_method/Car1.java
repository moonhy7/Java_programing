package ch06_4_method;

public class Car1 {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	// 연료충전 메소드
	void setGas(int gas) { // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
		this.gas = gas;
	} 
	// 연료잔량 상태
	boolean isLeftGas() { 
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	// 주행
	void run() throws InterruptedException {
		while(true) {
			if(gas > 0 ) {
				System.out.printf("주행중~~~[gas: %d]\n",gas);
				gas--;
			} else {
				System.out.printf("정지~!!!!~~[gas: %d]\n",gas);
				return; //메소드 실행 종료
			}
		}
	}
}
