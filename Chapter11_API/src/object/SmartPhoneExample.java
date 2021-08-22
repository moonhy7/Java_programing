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
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		StringExample strObj1 = myPhone.toString();
				System.out.println(strObj1);
		
		// 재정의된 toString()을 호출하고 리턴값을 받아 출력
		System.out.println(myPhone);
	}
}
