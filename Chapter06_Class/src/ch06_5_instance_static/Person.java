package ch06_5_instance_static;

public class Person {
	// 필드
	final String nation = "korea";
	final String ssn;
	String name;
	
	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}