package Exercise.ch07.sec1;

public class Computer extends Calculator{ // �ڽ� Ŭ����
	@Override // �޼ҵ� ������ (�������̵�)
	double areaCircle(double r) { 
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r; // Math = �ڹ� ǥ�� API
	}
//	@Override
	double areaCircl(double r) { // @Override�� ���� ��Ÿ�� ã�Ƽ� �����Ͽ����� ����.
								// @Override�� �Ⱦ��� �׳� ���ο� �޼ҵ�� �޾Ƶ���
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
