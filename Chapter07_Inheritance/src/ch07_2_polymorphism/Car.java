package ch07_2_polymorphism;

public class Car {

	//자동차는 4개의 타이어를 가짐
	Tire frontLeftTire = new Tire("앞 왼쪽 ", 6);
	Tire frontRightTire=new Tire("앞오른쪽",2);
	Tire backLeftTire=new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	//생성자
	
	//메소드
	//모든 타이어를 1회 회전 시키기 위해 각 Tire 객체의 roll() 메소드 호출
	//false 를 리턴하는 roll() 이 있을 경우 stop 메소드 호출, 타이어 번호 리턴
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if((frontLeftTire.roll())==false) {stop(); return 1;}
		if((frontRightTire.roll()==false)) {stop(); return 2; }
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다"); //펑크 났을 때 실행
	}
	
	
}