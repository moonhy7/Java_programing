package Exercise.ch07.sec1;

public class ComputerExample { // 자식 클래스 실행
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator(); // 덜 정확한 넓이 계산 메소드
		System.out.println("원면적: " + calculator.areaCircle(r) + "\n");
		
		Computer computer = new Computer(); // 정확한 넓이 계산 메소드
		System.out.println("원면적: " + computer.areaCircle(r));
	}
}
