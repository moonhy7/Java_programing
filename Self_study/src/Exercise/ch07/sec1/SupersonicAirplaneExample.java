package Exercise.ch07.sec1;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); // 이륙합니다.
		sa.fly(); // 일반비행합니다.
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // 초음속비행합니다.
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); // 일반비행합니다.
		sa.land(); // 착륙합니다.
	}
}
