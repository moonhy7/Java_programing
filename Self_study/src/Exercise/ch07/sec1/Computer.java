package Exercise.ch07.sec1;

public class Computer extends Calculator{ // 자식 클래스
	@Override // 메소드 재정의 (오버라이딩)
	double areaCircle(double r) { 
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; // Math = 자바 표준 API
	}
//	@Override
	double areaCircl(double r) { // @Override를 쓰면 오타를 찾아서 컴파일에러를 낸다.
								// @Override를 안쓰면 그냥 새로운 메소드로 받아들임
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
