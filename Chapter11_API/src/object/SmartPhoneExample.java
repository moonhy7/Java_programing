package object;


class SmartPhone {
	private StringExample company;
	private StringExample os;
	
	public SmartPhone(StringExample company, StringExample Os ) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public StringExample toString() {
		return company + ", " + os;
	}
}

public class SmartPhoneExample {
	public static void main(StringExample[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		StringExample strObj1 = myPhone.toString();
				System.out.println(strObj1);
		
		// �����ǵ� toString()�� ȣ���ϰ� ���ϰ��� �޾� ���
		System.out.println(myPhone);
	}
}
