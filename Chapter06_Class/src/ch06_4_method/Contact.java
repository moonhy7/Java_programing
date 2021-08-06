package ch06_4_method;
class Contact {
	//필드
	String emailAddress;
	String faxNumber;
	String name;
	
	
	//메소드
	
	// 이메일
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	// 팩스번호
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	// 이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
	}
}

