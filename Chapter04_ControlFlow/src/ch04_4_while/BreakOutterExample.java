package ch04_4_while;

public class BreakOutterExample {
	public static void main(String[] args) {
		Escape: for(char upper='A'; upper<='Z';upper++) {
			for(char lower='a';lower<'z';lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Escape; // �̸��� �ƹ����Գ� �����
					// �ҹ��ڰ�  g�� �Ǹ� �ٷ� Escape�� ���ִ� ������ Ż���ϰڴٴ� �ǹ�
				}
			}
		}
	System.out.println("���α׷� ���� ����");
	}
}
