package Exercise.ch07.sec2;

public class HankookTire extends Tire {
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override // 조금 다르게 내용을 출력하려고 roll() 메소드를 재정의함
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
