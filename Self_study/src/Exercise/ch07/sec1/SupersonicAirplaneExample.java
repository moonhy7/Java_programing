package Exercise.ch07.sec1;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); // �̷��մϴ�.
		sa.fly(); // �Ϲݺ����մϴ�.
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); // �����Ӻ����մϴ�.
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); // �Ϲݺ����մϴ�.
		sa.land(); // �����մϴ�.
	}
}
