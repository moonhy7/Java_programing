package ch07_2_polymorphism;

public class Tire {
//�ʵ� 

	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatiedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

	// ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// �޼ҵ�
	public boolean roll() {
		++accumulatiedRotation; // ���� ȸ���� 1 ����
		if (accumulatiedRotation < maxRotation) {
			System.out.println(location + "tire ���� : " + (maxRotation - accumulatiedRotation) + "ȸ");
			return true;

		} else { // ���� ȸ���� == Ÿ�̾� ���� �϶� ����
			System.out.println("***" + location + "Tire��ũ ***");
			return false;
		}
	}
}