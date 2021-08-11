package ch10_3_example;

public class BizThousandOverException extends Exception {
	@Override
	public String toString() {
		return "1000을 넘을 수 없습니다.";
	}
}
