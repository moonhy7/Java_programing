package ch06_4_method;

class ContactExample {
	
	public static void main(String[] args) {
		Contact con = new Contact();
		con.setName("김자바");
		System.out.println("이름 : " + con.getName());
		con.setEmailAddress("abc@gmail.com");
		System.out.println("이메일 : " + con.getEmailAddress());
		con.setFaxNumber("123-456");
		System.out.println("팩스번호 : " + con.getFaxNumber());
	}
}

 