package Exercise.ch06;

public class ShopService {
	// �̱��� ����� �ڵ�
	
	//�ʵ�
	private static ShopService shopService = new ShopService();
	
	//������
	private ShopService() {}
	
	//�޼ҵ�
	static ShopService getInstance() {
		return shopService;
	}
}
