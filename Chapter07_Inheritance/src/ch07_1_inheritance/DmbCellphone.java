package ch07_1_inheritance;
//									is a....
public class DmbCellphone extends CellPhone {
	// 필드
	int channel;
	
//	has a...
//	CellPhone cell;
	
	// 생성자
	public DmbCellphone(String moder, String color, int channel) {
		this.model = model; // CellPhone 클래스로부터 상속받은 필드
		this.color = color;
		this.channel = channel;
		System.out.println("자식 생성자 Call....");
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + " 번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOff() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
