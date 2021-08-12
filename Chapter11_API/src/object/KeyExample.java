package object;

import java.util.HashMap;

class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
}

public class KeyExample {
	public static void main(String[] args) {
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		hashMap.put(new Key(1), "ȫ�浿");
		
		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
	
}
