package ch02_2_primitive;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//�Ǽ��� ����
		//float var1 =3.14; <---������ ����
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//���е� �׽�Ʈ
		float var4 = 0.1234567890123456789f; 
		double var5 = 0.1234567890123456789;
		// ����Ҷ� Ÿ�Ժ� ��Ʈ���� ���� ������ �ȵǴ� �޺κ�  �߸�
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3); 
		System.out.println("var4: " + var4); // var4: 0.12345679
		System.out.println("var5: " + var5); // var5: 0.12345678901234568
		//var5(double)�� var4(float)���� �� �� �̻� �� �����ϴ�.
		
		//e ����Ͽ� ǥ��
		double var6 = 3e6; // 3.0 * 10^6
		float var7 = 3e6F; // 3.0 * 10^6
		double var8 = 2e-3; //2.0 * 10^(-3)
		// 0.0000000...00000003 ���� ���·� ���� 0�� ������ ���⵵ ������
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		

	}

}
