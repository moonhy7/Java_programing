package ch02_1_variable;
//p.55 ������ ������
public class VariableScopeExample {
	
//	main �޼ҵ� �ٱ����� ���� �����ϰ� ������ 
//	�׳� ���� ��������
//	int �տ� static ���̸� ���� �ȳ�
	
	// int v1 = 15; ������ 
	static int v1 = 15; // static�� ���� ����  
	
// public void main(String[] args) { ->static �Ⱦ�
	//static �Ⱦ��� �޸𸮿� �ö��� ����
 public static void main(String[] args) {
//	 VariableScopeExample ve = new 
	 
//	 int v1 = 15;
	 System.out.println(v1);

	 if(v1 > 10) {
		 System.out.println(v1);
		 System.out.println(v1>10);
		 int v2;
		 v2 = v1 - 10;
		 System.out.println(v2);

	 }
//	 int v3 = v1 + v2 + 5;	//������
	 //�������� ���� : if�� �ȿ��� ����� v2�� if�� �ۿ��� �� �� ����
	 
	 System.out.println("v1: " + v1);
//	 System.out.println("v2: " + v2);

	 for(int i=0; i<10; i++) {
		 int v3 = 500;
		 System.out.println(i + "��° " + v3);
	 }
	 
	 int num = 0;
	 
//	 .............
//	 System.out.println(v3);
//	 System.out.println("v1: " + v1);
//	 switch(num) {
//	 	double pi = 3.14;
//	 }
	 
	
	 
 }
}

class A {
	
	static int v1 = 15;
	void method() {
		
	}
}
