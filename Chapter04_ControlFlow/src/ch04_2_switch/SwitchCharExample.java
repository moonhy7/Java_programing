package ch04_2_switch;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		switch(grade) {
		
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default: //If������ else ����
			System.out.println("�մ��Դϴ�.");
		// break; �Ƚᵵ �� -> ������ �Ǹ����� ���̶� �ٷ� ��������
		}
		
		String position ="����";
		switch(position) {
		case "����": // ������ ���ٸ� case �ڿ��� intŸ���� �⺻�����̶�
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
		}
	}
}
