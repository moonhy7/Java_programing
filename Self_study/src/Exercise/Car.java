package Exercise;

public class Car {

	// �ʵ�
	String color;
	int cc;
	String madeby;
	String name;
	
	//������
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
	
	
	//�޼ҵ�
	void run() {
		System.out.printf("%s��%dcc�����޸���~~~",color,cc);
		System.out.println();
	}
	void run(String color, int cc, String madeby, String name) {
		System.out.printf("%s��%dcc�����޸���~~~",color,cc);
	}
	
}
