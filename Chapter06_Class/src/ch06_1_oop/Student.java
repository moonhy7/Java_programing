package ch06_1_oop;

public class Student {
//	public static void main(String[] args) {
//		Contact con = new Contact();
//		con.setName("���ڹ�");
//		System.out.println(con.getName());
//		
		int num = 0;
		
//		student() {	// �����ڰ� �ʿ������� 
//					// ���ι����� ���� ���� ����Ǿ� ���� �ʱ�ȭ�ϴµ� �۾��� ���� 
//		}			// ���� : �����͵�(�ʵ�?)  ������  �޼ҵ� ���� 
		
		Student() {
			num = 100;
		}	
		public int getNum() {
			return num;
		}
		
		public void setNum(int num) {
			this.num = num;
		}
	}

