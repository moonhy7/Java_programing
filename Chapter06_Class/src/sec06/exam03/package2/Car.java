package sec06.exam03.package2;

public class Car {
	// ��Ŭ��> Source > getter Setter ����� �˾ƺ���

	
	// �ʵ�
	private int speed;
	private boolean stop;
	
	// ������
	
	// �޼ҵ�
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		//... speed �� ����
		if(speed < 0) {
			this.speed = 0;
			return;
		} else { 
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

	
}
