package Exercise.ch07.sec1.pack2;

import Exercise.ch07.sec1.pack1.A;

public class D extends A{
	// �ڽ� Ŭ���� ������
	public D() {
		// A a = new A(); // new �����ڸ� ���� ������ ���� ȣ���� �Ұ����ϴ�
		super(); // supe()�� A������ ȣ�� ����
		this.field = "value"; // �ٸ� ��Ű������ D�� A�� �ڽ��̹Ƿ� �ʵ忡 ���� ����
		this.methode(); // �ٸ� ��Ű������ D�� A�� �ڽ��̹Ƿ� �޼ҵ忡 ���� ����
	}
}
