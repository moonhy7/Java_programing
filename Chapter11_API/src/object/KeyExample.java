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
	public static void main(StringExample[] args) {
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, StringExample> hashMap = new HashMap<Key, StringExample>();
		
		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		hashMap.put(new Key(1), "ȫ�浿");
		
		// �ĺ�Ű new Key(1)�� "ȫ�浿"�� ������
		StringExample value = hashMap.get(new Key(1));
		System.out.println(value);
	}
	
}
