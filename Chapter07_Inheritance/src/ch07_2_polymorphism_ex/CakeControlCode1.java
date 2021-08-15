package ch07_2_polymorphism_ex;

class Cake1 {
	public void sweet() {System.out.println("Cake.sweet()");}
}
class CheeseCake1 extends Cake1 {
	public void milky() {System.out.println("CheeseCake.milky()");}
}
class StrawberryCheeseCake1 extends CheeseCake1 {
	public void sour() {System.out.println("StrawberryCheeseCake.sour()");}
}

public class CakeControlCode1 {
	public static void main(String[] args) {
		// "StrawberryCheeseCake 인스턴스는 CheeseCake 인스턴스이면서 Cake 인스턴스이다."
		Cake1 cake1 = new StrawberryCheeseCake1();
		CheeseCake1 cake2 = new StrawberryCheeseCake1();
		cake1.sweet();
		cake2.milky();
		
		/*
		 * 참조변수 간 대입과 형변환
		 */
		
		CheeseCake1 ca1 = new CheeseCake1();
		Cake1 ca2 = ca1;
		
		Cake1 ca3 = new CheeseCake1();
//		CheeseCake ca4 = ca3; 불가능!!
		
		CheeseCake1 ca4 = (CheeseCake1) ca3; // 강제형변환
		
		/*
		 *  일괄 처리 (배열관점에서 정리)
		 */
		
		Cake1[] cakes = new CheeseCake1[10];
		
		for (int i=0; i< cakes.length; i++) {
			cakes[i] = new CheeseCake1();
		}
		
		
		
	}
}
