package ch06_4_method;

class ContactExample {
	
	public static void main(String[] args) {
		Contact con = new Contact();
		con.setName("���ڹ�");
		System.out.println("�̸� : " + con.getName());
		con.setEmailAddress("abc@gmail.com");
		System.out.println("�̸��� : " + con.getEmailAddress());
		con.setFaxNumber("123-456");
		System.out.println("�ѽ���ȣ : " + con.getFaxNumber());
	}
}

 