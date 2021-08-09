package Exercise.ch06;

public class ShopService {
	// 싱글톤 만드는 코드
	
	//필드
	private static ShopService shopService = new ShopService();
	
	//생성자
	private ShopService() {}
	
	//메소드
	static ShopService getInstance() {
		return shopService;
	}
}
