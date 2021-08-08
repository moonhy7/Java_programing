package RegularTest;

public class RegularTest {
	//문제 8 
	// Math 클래스를 이용해 1~100 까지의 난수 50개 중에서 짝수만 출력하는 코드를 작성
	public static void main(String[] args) {
		for(int i=0; i<50; i++) {
			int var = (int)(Math.random()*100) + 1;
			if(var%2 == 0) {
				System.out.print(var + ", ");
			}
		} System.out.println();
		
		// 문제해결 시나리오 1
		Car myCar = new Car("검정", 3000);
		Car subCar = new Car("그레이", 1600, "현대", "아반떼");
		
		myCar.run();
		subCar.run();
	
		// 문제해결 시나리오 2
		Util u = new Util();
		System.out.println(u.findPi());
		
		
	}
}

class Util{
	public double findPi() {
		return 3.14;
	}
}

class Car{
	//필드
	String color;
	int gas;
	String company;
	String model;
	
	//생성자 오버로딩
	Car(String color, int gas) {
		this.color = color;
		this.gas = gas;
	}
	
	Car(String color, int gas, String company, String model) {
		this.color = color;
		this.gas = gas;
		this.company = company;
		this.model = model;
	}
	
	//메소드
	void run() {
		System.out.printf(color + "색" + gas + "차가달린다~~~\n" );
	}
	
}