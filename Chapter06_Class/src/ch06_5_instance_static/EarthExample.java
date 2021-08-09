package ch06_5_instance_static;

public class EarthExample {
	public static void main(String[] args) {
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS);
		// 객체 생성 없이 클래스.~ 로 바로 사용 : static 으로 선언 되었음
		System.out.println("지구의 표면적: " + Earth.EARTH_AREA);
	}
}