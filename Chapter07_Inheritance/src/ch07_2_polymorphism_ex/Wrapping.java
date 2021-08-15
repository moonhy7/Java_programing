package ch07_2_polymorphism_ex;

public class Wrapping {
	public static void main(String[] args) {
		// 객체 생성
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		// 메소드 호출
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

	// 메소드 선언
	private static void wrapBox(Box box) {
		System.out.println(box instanceof Box);
		System.out.println(box instanceof PaperBox);
		System.out.println(box instanceof GoldPaperBox);
		System.out.println();
	}
}

class Box {}
class PaperBox extends Box{}
class GoldPaperBox extends PaperBox{}
