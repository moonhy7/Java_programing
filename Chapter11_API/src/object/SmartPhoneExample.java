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
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj1 = myPhone.toString();
				System.out.println(strObj1);
		
		// 재정의된 toString()을 호출하고 리턴값을 받아 출력
		System.out.println(myPhone);
	}
}
