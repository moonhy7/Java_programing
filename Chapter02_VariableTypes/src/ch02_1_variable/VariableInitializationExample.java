package ch02_1_variable;
//p.51
public class VariableInitializationExample {
//	ī��ǥ���(�빮�ڼҹ��ڼ��=������������!)
	public static void main(String[] args) {
		
//��������p.48~
		int value = 1;
//		int val;
//		val = 1; �̷��� �ᵵ ��
		
//		int value; �̷��Ը� �������ָ� ��������
//		���� ����
//		The local variable value may not have been initialized
		
		int	result = value + 10;
		//���� result ���� �а� �ֿܼ� ���
		System.out.println(result);
		
		int x = 0;
		int y = 0;
		double z = 0.0; //�̷��� �ʱ�ȭ�� ���ְ� �����ϴ°� ����
		
//		int aa= 0, bb = 0, cc = 0; �̷��� �ѹ��� ���𰡴�
		int aa = 0;
		int bb = 0;
		int cc = 0;

		int a = 5; //���� (���氡��)
		int b = 0; //����
		final double pi = 3.141592; //���
		

//		����?
//		���?
		a = 10; //(���氡��)
		a = 100;
//		pi = 0.01; ������.. ��� ���� �� ���� �Ұ�
		System.out.println(a==b);
		int c = 0;
		b = a;
		
//		�׷��ٸ� ����� ��� ���̳�
//		�ѹ� ������ �� �ٲ��������� ������ 
//		��)���İ��
		int r = 0;
		double area = r*r*3.141592;
//		�̷��� �� ��Ȳ���� ���� �Ҽ��� ���ڸ��� �ٲٶ�� �ϸ�
//		������ �ٲ���ϴ� ����...
//		���̿��ٰ� �־������ �װ͸� �ٲٸ� ��!
//		��� : ���� ���� ����� �� ���� �� �� �����س���
	}
}






