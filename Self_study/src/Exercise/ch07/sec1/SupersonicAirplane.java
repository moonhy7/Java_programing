package Exercise.ch07.sec1;

public class SupersonicAirplane extends Airplane {
	//필드
	public static final int NORMAL = 1; // 가독성을 높여주기위해 자주 사용되는 고정값들은 상수 사용
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) { // 값이 SUPERSONIC일 경우에는 초음속비행
			System.out.println("초음속비행합니다.");
		} else { // 그렇지 않은 경우에는 부모 클래스의 fly() 메소드를 호출
			super.fly();
		}
	}
}
