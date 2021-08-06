package Exercise;

public class Car {

	// 필드
	String color;
	int cc;
	String madeby;
	String name;
	
	//생성자
	Car(String color, int cc) {
		this.color = color;
		this.cc = cc;
		
	}
	
	Car(String color, int cc, String madeby, String name) {
		this.color = color;
		this.cc = cc;
		this.madeby = madeby;
		this.name = name;
	}
	
	
	//메소드
	void run() {
		System.out.printf("%s색%dcc차가달린다~~~",color,cc);
		System.out.println();
	}
	void run(String color, int cc, String madeby, String name) {
		System.out.printf("%s색%dcc차가달린다~~~",color,cc);
	}
	
}
