package Exercise.ch07.sec1;

public class SupersonicAirplane extends Airplane {
	//�ʵ�
	public static final int NORMAL = 1; // �������� �����ֱ����� ���� ���Ǵ� ���������� ��� ���
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) { // ���� SUPERSONIC�� ��쿡�� �����Ӻ���
			System.out.println("�����Ӻ����մϴ�.");
		} else { // �׷��� ���� ��쿡�� �θ� Ŭ������ fly() �޼ҵ带 ȣ��
			super.fly();
		}
	}
}
