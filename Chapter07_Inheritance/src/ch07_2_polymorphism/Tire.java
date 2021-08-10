package ch07_2_polymorphism;

public class Tire {
//필드 

	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accumulatiedRotation; // 누적 회전수
	public String location; // 타이어 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		++accumulatiedRotation; // 누적 회전수 1 증가
		if (accumulatiedRotation < maxRotation) {
			System.out.println(location + "tire 수명 : " + (maxRotation - accumulatiedRotation) + "회");
			return true;

		} else { // 누적 회전수 == 타이어 수명 일때 실행
			System.out.println("***" + location + "Tire펑크 ***");
			return false;
		}
	}
}