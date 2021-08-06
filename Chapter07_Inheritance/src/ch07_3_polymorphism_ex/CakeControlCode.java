package ch07_3_polymorphism_ex;

class Cake {
	public void sweet() {System.out.println("Cake.sweet()");}
}
class CheeseCake extends Cake {
	public void milky() {System.out.println("CheeseCake.milky()");}
}
class StrawberryCheeseCake extends CheeseCake {
	public void sour() {System.out.println("StrawberryCheeseCake.sour()");}
}

public class CakeControlCode {
	public static void main(String[] args) {
		// "StrawberryCheeseCake 인스턴스는 CheeseCake 인스턴스이면서 Cake 인스턴스이다."
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		cake1.sweet();
		cake2.milky();
		
		/*
		 * 참조변수 간 대입과 형변환
		 */
		
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1;
		
		Cake ca3 = new CheeseCake();
//		CheeseCake ca4 = ca3; 불가능!!
		
		CheeseCake ca4 = (CheeseCake) ca3; // 강제형변환
		
		/*
		 *  일괄 처리 (배열관점에서 정리)
		 */
		
		Cake[] cakes = new CheeseCake[10];
		
		for (int i=0; i< cakes.length; i++) {
			cakes[i] = new CheeseCake();
		}
		
		
		
	}
}
