package ch07_1_inheritance;
//									is a....
public class DmbCellphone extends CellPhone {
	// �ʵ�
	int channel;
	
//	has a...
//	CellPhone cell;
	
	// ������
	public DmbCellphone(String moder, String color, int channel) {
		this.model = model; // CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		this.color = color;
		this.channel = channel;
		System.out.println("�ڽ� ������ Call....");
	}
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + " �� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOff() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
