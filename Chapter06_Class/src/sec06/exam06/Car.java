package sec06.exam06;

public class Car {
	// 우클릭> Source > getter Setter 만들기 알아보기

	// 필드
	private int speed;
	private boolean stop;
	
	// 생성자
	
	// 메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		//... speed 값 검증
		if(speed < 0) {
			this.speed = 0;
			return;
		} else { 
			this.speed = speed;
		}
	}
	
	public boolean isStop() { // boolean 타입은 is..로 이름을 지을것
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

	
}
