package ch06_1_oop;

public class Student {
//	public static void main(String[] args) {
//		Contact con = new Contact();
//		con.setName("���ڹ�");
//		System.out.println(con.getName());
//		
		int num = 0;
		
		Student() {	// �����ڰ� �ʿ������� 
			num = 100;		// ���ι����� ���� ���� ����Ǿ� ���� �ʱ�ȭ�ϴµ� �۾��� ���� 
		}			// ���� : �����͵�(�ʵ�?)  ������  �޼ҵ� ���� 

		public int getNum() {
			return num;
		}
		
		public void setNum(int num) {
			this.num = num;
		}
	}

