package ch07_2_polymorphism;

public class KumhoTire extends Tire{
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatiedRotation;
		if(accumulatiedRotation<maxRotation) {
			System.out.println(location+"KumhoTire ����: "+(maxRotation-accumulatiedRotation)+"ȸ");
		return true;
		}else {
			System.out.println("***"+location+"KumhoTire ��ũ***");
		return false;
		}
	}
}
