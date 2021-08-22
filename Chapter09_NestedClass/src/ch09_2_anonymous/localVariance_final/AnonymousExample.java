package ch09_2_anonymous.localVariance_final;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.method(20, 30); // 10 + 20 + 30 + 40 + 50 = 150
	}
}
