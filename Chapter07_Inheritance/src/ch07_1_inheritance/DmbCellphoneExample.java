package ch07_1_inheritance;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		
		// DmbCellphone ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("�ڹ���", "����", 10);
	
		// Cellphone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellphone.model);
		System.out.println("����: " + dmbCellphone.color);
		
		// DmbCellphone Ŭ������ �ʵ�
		System.out.println("ä��: " + dmbCellphone.channel);

		// Cellphone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellphone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellphone.hangUp();
		
		//DmbCellphone Ŭ������ �޼ҵ� ȣ��
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOff();
	}
}
