package ch07_2_polymorphism;

public class HankookTire extends Tire {
//�ʵ�
//������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatiedRotation;
		if(accumulatiedRotation<maxRotation) {
			System.out.println(location+"hankookTire ����: "+(maxRotation-accumulatiedRotation)+"ȸ");
		return true;
		}else {
			System.out.println("***"+location+"HankookTire ��ũ***");
		return false;
		}
	}
}