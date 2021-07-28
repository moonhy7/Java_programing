package method;

public class ControlFolw2 {
//	public static void main(String[] args) {
		//노가다 방법
//		int a = 1;
//		int b = 5;
//		int c = a + b;
//		System.out.println(c);
//		
//		a = 11;
//		b = 22;
//		c = a+b;
//		System.out.println(c);
//		
//		a = 33;
//		b = 55;
//		c = a+b;
//		System.out.println(c);
		

//		main문에는 이렇게 간단히만 쓰게할 수는 없을까?
//		add(1,5);
//		add(11,22);
//		add(33,55);
//	}	
//}
	
	
	public static void main(String[] args) {
		// "오버로딩"
		add1(1,5);
		add1(11,22);
		add1(33,55);
		add2(1.5,3.1);
		
		int result = add3(1,2);
		
		System.out.println(result);
	}
	
	public static void add1(int i, int j) {
		System.out.println(i+j);
	}
	

	public static void add2(double i ,double j) {
		System.out.println(i + j);
	} //void는 리턴을 안받는구나 
	
	//리턴 타입을 꼭 써주어야함
	public static int add3(int i, int j) {
		return i + j;
	}
	
	
	// 오버로딩은 계산기,메뉴 등등 예제만들어보면서
	// 직접 원하는걸 찍어볼것
}
