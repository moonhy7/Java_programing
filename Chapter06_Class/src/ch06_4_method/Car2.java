package ch06_4_method;

public class Car2 {
	//�ʵ�
	int speed;
	
	//������
	
	//�޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	} 
		
	void run() {
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.printf("�޸��ϴ�.(�ü�:" + speed + "km/h)\n");
			}
		}
	}

