package ch02_2_primitive;

public class LongExample {
	public static void main(String[] args) {
	/*
	 * �⺻������ �ڹ� �����Ϸ��� ���� ���ͷ��� int ������ �����Ѵ�.
	 * long Ÿ������ ��������� �����Ϸ����� �˷���� �Ѵ�.
	 */
//		byte
//		int var = 10; // ������
//		
//		short
//		long var = 10L;
		
		int var = 1000000000;
	

		long var1 = 10; // 10
		long var2 = 20L; // 20
//		long var3 = 1000000000000; // ���� �߻�
		long var4 = 1000000000000L; // 10000000000 (8byte)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
