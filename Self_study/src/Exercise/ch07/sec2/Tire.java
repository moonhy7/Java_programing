package Exercise.ch07.sec2;

public class Tire {
	// �ʵ�
	public int maxRotation;			// �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;	// ���� ȸ����
	public String location;			// Ÿ�̾��� ��ġ
	
	// ������
	public Tire(String location, int maxRotation) {
		this.location = location; // �ʱ�ȭ
		this.maxRotation = maxRotation; // �ʱ�ȭ
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1 ����
		if(accumulatedRotation < maxRotation) { 
			System.out.println(location + " Tire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true; // ����ȸ��(����<�ִ�)�� ��� ����
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false; // ��ũ(����=�ִ�)�� ��� ����
		}
	}
}
