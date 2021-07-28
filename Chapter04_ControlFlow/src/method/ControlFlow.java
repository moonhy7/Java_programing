package method;

public class ControlFlow {
	public static void main(String[] args) {
		
		double time = 9;
		boolean open = true;
		while(open) {
			// 1. 고객 IN
			System.out.println("안녕하십니까? 고객님~");
			// 2. 메뉴 보여주기
			System.out.println("Display Menu~");
			// 3. 주문 접수"
			System.out.println("상품(code) 입력");
			// 4. 상품제조
			makeCoffee();
			// 5. 고객 전달
			System.out.println("Serving");
			// 6. 고객 OUT
			System.out.println("또 오세요~\n");
			
			if(time > 21) {
				open = false;
				System.out.println("영업종료");
			} time++;
		}
	}
		
	// 메서드(함수)
	static void makeCoffee() {
		System.out.println("커피 만드는 중...");
	}			
}
	

