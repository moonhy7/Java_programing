package ch04_2_switch;

public class SwitchExample {
	public static void main(String[] args) {
		
		//�б�� �����°� else if, ������ �����°� switch ?
		
		//switch���� ������ �ϳ� �ϱ��س����� ���߿� ����ϱ� ����
		// break�� �ϳ��ϳ� �־����, 
		
		// break�� ���ư��� ���ø� ������
		int score = 85;
		char grade;
		switch(score) {
		case 100 : 
		case 99 : 
		case 85 :
		grade = 'A';
		break;
		case 89 : 
		case 88 :
			grade = 'B';
		}
		
		// break�� ������ ��� �귯������ �� �� �ִ� ����
		// case ���� break�ϴ°� �ƴ϶� �츮�� ���ϴ� ������ ����
		// �� �����Ű���� �ϱ� ���� �߰� �߰� �� break�� ��
		// ���� 
		int month = 3;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�ܿ��Դϴ�.");
			break;
		}
		
	}
}
