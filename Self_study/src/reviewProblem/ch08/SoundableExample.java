package reviewProblem.ch08;

interface Soundable {
	// 眠惑 皋家靛
	public abstract String sound();
}

class Cat implements Soundable{
	@Override
	public String sound() {
		return "具克";
	}
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "港港";
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
