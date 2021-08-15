package ch07_2_polymorphism_ex;

class Cake {
	// 메소드
	public void sweet() {System.out.println("Cake.sweet()");}
	public void send() {System.out.println("Cake sending....");}
}

class CheeseCake extends Cake {
	// 메소드
	public void milky() {System.out.println("CheeseCake.milky()");}
	@Override // 메소드 오버라이딩
	public void send() {System.out.println("CheeseCake Sending....");}
}

class StrawberryCheeseCake extends CheeseCake {
	// 메소드
	public void sour() {System.out.println("StrawberryCheeseCake.sour()");}
	@Override // 메소드 오버라이딩
	public void send() {System.out.println("StrawberryCheeseCake sending....");}
}

public class CakeControlCode {
	public static void main(String[] args) {
		// StrawberryCheeseCake 인스턴스는 Cake과 CheeseCake의 인스턴스다.
		Cake cake1 = new StrawberryCheeseCake(); // 딸기치즈케익을 케익 타입으로 자동 타입 변환
		CheeseCake cake2 = new StrawberryCheeseCake(); // 딸기치즈케익을 치즈케익 타입으로 자동 타입 변환
		
		cake1.sweet(); // Cake.sweet()
		cake2.milky(); // CheeseCake.milky()
		cake2.sweet(); // Cake.sweet() -> 더 상위 클래스의 메소드는 호츌이 된다.
		
		// 참조변수 간 대입과 형변환
		CheeseCake cake3 = new CheeseCake();
		Cake cake4 = cake3; // 자동 형변환
		
		Cake cake5 = new CheeseCake();
		// CheeseCake cake6 = cake5; // 불가능함. 이미 Cake 타입으로 형변환된 상태이므로. 
		CheeseCake cake6 = (CheeseCake)cake5;
		 
		// 일괄처리 (배열 관점)
		Cake[] cakes = new Cake[3]; // 배열 안에 참조를 넣음
		
		cakes[0] = new Cake();
		cakes[1] = new CheeseCake();
		cakes[2] = new StrawberryCheeseCake();
		
		for(int i=0; i<cakes.length; i++) {
			cakes[i] = new CheeseCake(); // 이 과정을 꼭 거쳐야함. cakes의 각 방에 CheeseCake 객체를 넣어준다.
			cakes[i].send();
		}
	}	
}
