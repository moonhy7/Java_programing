package object;


class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String Os ) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + ", " + os;
	}
}

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj1 = myPhone.toString();
				System.out.println(strObj1);
		
		// �����ǵ� toString()�� ȣ���ϰ� ���ϰ��� �޾� ���
		System.out.println(myPhone);
	}
}
