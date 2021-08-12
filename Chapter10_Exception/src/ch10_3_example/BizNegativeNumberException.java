package ch10_3_example;

public class BizNegativeNumberException extends Exception {
	@Override
	public String toString() {
		return "음수가 될 수 없습니다.";
	}
}
