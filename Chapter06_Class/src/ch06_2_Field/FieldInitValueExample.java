package ch06_2_Field;

class FieldInitValue {
	//�ʵ�
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
		//��ü ����
		FieldInitValue fiv = new FieldInitValue();
		
		//�ʵ尪 �б�
		System.out.println("fiv.byteField = " + fiv.byteField);
		System.out.println("fiv.shortField = " + fiv.shortField);
		System.out.println("fiv.intField = " + fiv.intField);
		System.out.println("fiv.longField = " + fiv.longField);
		
		System.out.println("fiv.booleanField = " + fiv.booleanField);
		System.out.println("fiv.charField = " + fiv.charField); // char�� ����Ʈ���� �������� ����
		
		System.out.println("fiv.floatField = " + fiv.floatField);
		System.out.println("fiv.doubleField = " + fiv.doubleField); 
		
		System.out.println("fiv.arrField = " +fiv.arrField);
		System.out.println("fiv.referenceField = " +fiv.referenceField); //null

	}
}
