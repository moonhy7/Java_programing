package reviewProblem.ch07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // 자동 타입 변환
		// Tire tire = new SnowTire(); // 이렇게 한 줄로 쓸 수도 있음
		
		snowTire.run(); // 스노우 타이어가 굴러갑니다.
		tire.run(); // 스노우 타이어가 굴러갑니다.
	}
}