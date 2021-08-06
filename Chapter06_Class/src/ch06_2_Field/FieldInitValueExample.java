package ch06_2_Field;

class FieldInitValue {
	//필드
	byte byteField;
	short shortField;
	int intField;
	long longField;

	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;
	String referenceField;
}

public class FieldInitValueExample {
	public static void main(String[] args) {
		//객체 생성
		FieldInitValue fiv = new FieldInitValue();
		
		//필드값 읽기
		System.out.println("fiv.byteField = " + fiv.byteField);
		System.out.println("fiv.shortField = " + fiv.shortField);
		System.out.println("fiv.intField = " + fiv.intField);
		System.out.println("fiv.longField = " + fiv.longField);
		
		System.out.println("fiv.booleanField = " + fiv.booleanField);
		System.out.println("fiv.charField = " + fiv.charField); // char의 디폴트값은 지정되지 않음
		
		System.out.println("fiv.floatField = " + fiv.floatField);
		System.out.println("fiv.doubleField = " + fiv.doubleField); 
		
		System.out.println("fiv.arrField = " +fiv.arrField);
		System.out.println("fiv.referenceField = " +fiv.referenceField); //null

	}
}
