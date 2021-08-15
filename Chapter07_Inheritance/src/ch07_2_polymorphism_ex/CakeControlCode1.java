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
		// "StrawberryCheeseCake �ν��Ͻ��� CheeseCake �ν��Ͻ��̸鼭 Cake �ν��Ͻ��̴�."
		Cake1 cake1 = new StrawberryCheeseCake1();
		CheeseCake1 cake2 = new StrawberryCheeseCake1();
		cake1.sweet();
		cake2.milky();
		
		/*
		 * �������� �� ���԰� ����ȯ
		 */
		
		CheeseCake1 ca1 = new CheeseCake1();
		Cake1 ca2 = ca1;
		
		Cake1 ca3 = new CheeseCake1();
//		CheeseCake ca4 = ca3; �Ұ���!!
		
		CheeseCake1 ca4 = (CheeseCake1) ca3; // ��������ȯ
		
		/*
		 *  �ϰ� ó�� (�迭�������� ����)
		 */
		
		Cake1[] cakes = new CheeseCake1[10];
		
		for (int i=0; i< cakes.length; i++) {
			cakes[i] = new CheeseCake1();
		}
		
		
		
	}
}
