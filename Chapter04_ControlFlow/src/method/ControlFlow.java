package method;

public class ControlFlow {
	public static void main(String[] args) {
		
		double time = 9;
		boolean open = true;
		while(open) {
			// 1. �� IN
			System.out.println("�ȳ��Ͻʴϱ�? ����~");
			// 2. �޴� �����ֱ�
			System.out.println("Display Menu~");
			// 3. �ֹ� ����"
			System.out.println("��ǰ(code) �Է�");
			// 4. ��ǰ����
			makeCoffee();
			// 5. �� ����
			System.out.println("Serving");
			// 6. �� OUT
			System.out.println("�� ������~\n");
			
			if(time > 21) {
				open = false;
				System.out.println("��������");
			} time++;
		}
	}
		
	// �޼���(�Լ�)
	static void makeCoffee() {
		System.out.println("Ŀ�� ����� ��...");
	}			
}
	

