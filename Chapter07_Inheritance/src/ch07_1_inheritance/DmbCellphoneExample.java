package ch07_1_inheritance;

public class DmbCellphoneExample {
	public static void main(String[] args) {
		
		// DmbCellphone 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);
	
		// Cellphone 클래스로부터 상속받은 필드
		System.out.println("모델: " + dmbCellphone.model);
		System.out.println("색상: " + dmbCellphone.color);
		
		// DmbCellphone 클래스의 필드
		System.out.println("채널: " + dmbCellphone.channel);

		// Cellphone 클래스로부터 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellphone.sendVoice("아~ 예 반갑습니다.");
		dmbCellphone.hangUp();
		
		//DmbCellphone 클래스의 메소드 호출
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOff();
	}
}
