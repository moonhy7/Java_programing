package object;

class Value {
	//필드
	int value;
	
	
	@Override
	public boolean equals(Object obj) {
		if(this.value == ((Value)obj).value) {
			return true;
		} else {
			return false;
		}
	}
	
	//생성자
	public Value(int value) {
		this.value = value;
	}
	
}

public class ObjectOrg {
	public static void main(StringExample[] args) {
		Value v1 = new Value(701021);
		Value v2 = new Value(701021);
	
		System.out.println(v1 instanceof Value); // true
		System.out.println(v2 instanceof Value); // true
		
		System.out.println(v1); // object.Value@15db9742
		System.out.println(v2); // object.Value@6d06d69c
		
		System.out.println(v1 == v2); // false
		
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2));
	
	}
}
