package bitcamp.common;

public class BizNagativeNumberException extends Exception {
	@Override
	public String toString() {
		return "음수가 될 수 없습니다.";
	}
}
