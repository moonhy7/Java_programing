package reviewProblem.ch08;

interface Soundable {
	// �߻� �޼ҵ�
	public abstract String sound();
}

class Cat implements Soundable{
	@Override
	public String sound() {
		return "�߿�";
	}
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "�۸�";
	}
}

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
