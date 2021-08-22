package reviewProblem.ch09.prob3;

public class CheckBoxExample {
	public static void main(String[] args) {
		// CheckBox ��ü ����
		CheckBox checkBox = new CheckBox();
		
		// ������ ���� ��ü(new �ڿ� ���ִ� ��)�� setter �޼ҵ�� �޾Ƽ� �ʵ忡 ����
		checkBox.setOnSelectListener(
			new CheckBox.OnSelectListener() { // �������̽� Ÿ�� �͸� ��ü ����
				@Override
				public void onSelect() { // ��ü �޼ҵ�� ������
					System.out.println("����� �����մϴ�.");
				}
			}
		);
		
		checkBox.select(); // '����'�̶�� �̺�Ʈ �߻�
	}
}
