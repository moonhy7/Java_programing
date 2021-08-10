package Exercise.ch07.sec2;

public class Car {
	//필드
	Tire frontLeft = new Tire("앞 왼쪽", 6); // 자동차에 4개의 타이어 객체 생성
	Tire frontRight = new Tire("앞 오른쪽", 2); 
	Tire backLeft = new Tire("뒤 왼쪽", 3); 
	Tire backRight = new Tire("뒤 오른쪽", 4);
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]"); 
		// 모든 타이어가 1회씩 실행되어야 하므로 각 Tire 객체의 roll() 메소드를 호출
		// false(펑크)를 리턴하는게 나오면 stop() 메소드 호출 후 해당 타이어 번호를 리턴
		if(frontLeft.roll() == false) {stop(); return 1;}
		if(frontRight.roll() == false) {stop(); return 2;}
		if(backLeft.roll() == false) {stop(); return 3;}
		if(backRight.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]"); // 펑크났을때 실행 
	}
}
