package ch07_2_polymorphism_ex;

public class Wrapping {
	public static void main(String[] args) {
		// ��ü ����
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		// �޼ҵ� ȣ��
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

	// �޼ҵ� ����
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
