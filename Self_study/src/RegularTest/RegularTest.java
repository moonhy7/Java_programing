package RegularTest;

public class RegularTest {
	//���� 8 
	// Math Ŭ������ �̿��� 1~100 ������ ���� 50�� �߿��� ¦���� ����ϴ� �ڵ带 �ۼ�
	public static void main(String[] args) {
		for(int i=0; i<50; i++) {
			int var = (int)(Math.random()*100) + 1;
			if(var%2 == 0) {
				System.out.print(var + ", ");
			}
		} System.out.println();
		
		// �����ذ� �ó����� 1
		Car myCar = new Car("����", 3000);
		Car subCar = new Car("�׷���", 1600, "����", "�ƹݶ�");
		
		myCar.run();
		subCar.run();
	
		// �����ذ� �ó����� 2
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
	//�ʵ�
	String color;
	int gas;
	String company;
	String model;
	
	//������ �����ε�
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
	
	//�޼ҵ�
	void run() {
		System.out.printf(color + "��" + gas + "�����޸���~~~\n" );
	}
	
}