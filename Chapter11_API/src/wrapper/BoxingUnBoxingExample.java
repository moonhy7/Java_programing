package wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		
	// �ڽ� 
	Integer obj1 = new Integer(100);
	Integer obj2 = new Integer(200);
//	Integer obj3 = new Integer.valueOf("200");
	
	// ��ڽ�
	int value1 = obj1.intValue();
	int value2 = obj2.intValue();
//	int value3 = obj3.intValue();
	
	System.out.println(value1);
	
	}
}
