package ch07_2_polymorphism;

public class HankookTire extends Tire {
//필드
//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatiedRotation;
		if(accumulatiedRotation<maxRotation) {
			System.out.println(location+"hankookTire 수명: "+(maxRotation-accumulatiedRotation)+"회");
		return true;
		}else {
			System.out.println("***"+location+"HankookTire 펑크***");
		return false;
		}
	}
}