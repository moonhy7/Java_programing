package ch07_2_polymorphism_ex;

class Cake {
	// �޼ҵ�
	public void sweet() {System.out.println("Cake.sweet()");}
	public void send() {System.out.println("Cake sending....");}
}

class CheeseCake extends Cake {
	// �޼ҵ�
	public void milky() {System.out.println("CheeseCake.milky()");}
	@Override // �޼ҵ� �������̵�
	public void send() {System.out.println("CheeseCake Sending....");}
}

class StrawberryCheeseCake extends CheeseCake {
	// �޼ҵ�
	public void sour() {System.out.println("StrawberryCheeseCake.sour()");}
	@Override // �޼ҵ� �������̵�
	public void send() {System.out.println("StrawberryCheeseCake sending....");}
}

public class CakeControlCode {
	public static void main(String[] args) {
		// StrawberryCheeseCake �ν��Ͻ��� Cake�� CheeseCake�� �ν��Ͻ���.
		Cake cake1 = new StrawberryCheeseCake(); // ����ġ�������� ���� Ÿ������ �ڵ� Ÿ�� ��ȯ
		CheeseCake cake2 = new StrawberryCheeseCake(); // ����ġ�������� ġ������ Ÿ������ �ڵ� Ÿ�� ��ȯ
		
		cake1.sweet(); // Cake.sweet()
		cake2.milky(); // CheeseCake.milky()
		cake2.sweet(); // Cake.sweet() -> �� ���� Ŭ������ �޼ҵ�� ȣ���� �ȴ�.
		
		// �������� �� ���԰� ����ȯ
		CheeseCake cake3 = new CheeseCake();
		Cake cake4 = cake3; // �ڵ� ����ȯ
		
		Cake cake5 = new CheeseCake();
		// CheeseCake cake6 = cake5; // �Ұ�����. �̹� Cake Ÿ������ ����ȯ�� �����̹Ƿ�. 
		CheeseCake cake6 = (CheeseCake)cake5;
		 
		// �ϰ�ó�� (�迭 ����)
		Cake[] cakes = new Cake[3]; // �迭 �ȿ� ������ ����
		
		cakes[0] = new Cake();
		cakes[1] = new CheeseCake();
		cakes[2] = new StrawberryCheeseCake();
		
		for(int i=0; i<cakes.length; i++) {
			cakes[i] = new CheeseCake(); // �� ������ �� ���ľ���. cakes�� �� �濡 CheeseCake ��ü�� �־��ش�.
			cakes[i].send();
		}
	}	
}
