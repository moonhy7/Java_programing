package ch06_4_method;

public class Car2 {
	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	} 
		
	void run() {
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.printf("달립니다.(시속:" + speed + "km/h)\n");
			}
		}
	}

