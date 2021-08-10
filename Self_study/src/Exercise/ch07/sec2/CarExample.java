package Exercise.ch07.sec2;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // Car 객체 생성
		
		for(int i=1; i<=5; i++) { // Car 객체의 run() 메소드 5번 반복 실행
			int problemLocation = car.run();
		
			switch(problemLocation) {
			case 1: // 앞 왼쪽 타이어가 펑크났을때 HankookTire로 교체
				System.out.println("앞 왼쪽 타이어를 HankokTire로 교체");
				car.frontLeft = new HankookTire("앞 왼쪽", 15);
				break;
			case 2: // 앞 오른쪽 타이어가 펑크났을때 KumhoTire로 교체
				System.out.println("앞 오른쪽 타이어를 KumhoTire로 교체");
				car.frontRight = new KumhoTire("앞 오른쪽", 13);
				break;
			case 3: // 뒤 왼쪽 타이어가 펑크났을때 HankookTire로 교체
				System.out.println("뒤 왼쪽 타이어를 HankokTire로 교체");
				car.backLeft = new HankookTire("뒤 왼쪽", 14);
				break;
			case 4: // 뒤 오른쪽 타이어가 펑크났을때 KumhoTire로 교체
				System.out.println("뒤 오른쪽 타이어를 KumhoTire로 교체");
				car.backRight = new KumhoTire("뒤 오른쪽", 17);
				break;
			} 
			System.out.println("------------------------------------");
		}
	}
}
