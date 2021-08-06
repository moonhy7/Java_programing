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
		// "StrawberryCheeseCake �ν��Ͻ��� CheeseCake �ν��Ͻ��̸鼭 Cake �ν��Ͻ��̴�."
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		cake1.sweet();
		cake2.milky();
		
		/*
		 * �������� �� ���԰� ����ȯ
		 */
		
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1;
		
		Cake ca3 = new CheeseCake();
//		CheeseCake ca4 = ca3; �Ұ���!!
		
		CheeseCake ca4 = (CheeseCake) ca3; // ��������ȯ
		
		/*
		 *  �ϰ� ó�� (�迭�������� ����)
		 */
		
		Cake[] cakes = new CheeseCake[10];
		
		for (int i=0; i< cakes.length; i++) {
			cakes[i] = new CheeseCake();
		}
		
		
		
	}
}
