package ch06_1_oop;

public class Student {
		
		int num = 0;
		
		//������
		Student() {	
			num = 100;		
		}				
		// �����ڰ� �ʿ������� 
		// ���ι��� ���� ���� ���� ����Ǿ� ���� �ʱ�ȭ�ϴµ� �۾��� ���� 
		// ���� : �����͵�(�ʵ�?)  ������  �޼ҵ� ���� 
		
		public int getNum() {
			return num;
		}
		
		public void setNum(int num) {
			this.num = num;
		}
	}

