package ch04_1_if;

public class IfDiceExample {
	public static void main(String[] args) {
		System.out.println(Math.random()); // 임의의정수 하나 얻기
		
		System.out.println(Math.random()); //0~1 사이 실수를 무작위로 꺼냄
		
		int number= (int) (10 * (Math.random()));
		System.out.println(number);

//		0~9까지의 수 를 무작위로 뽑기
		System.out.println((int)(Math.random()*10));
		

//		1~10까지의 수 를 무작위로 뽑기
		System.out.println((int)(Math.random()*10 + 1));

//		1~100까지의 수 를 무작위로 뽑기
		System.out.println((int)(Math.random()*100 + 1));


//		주사위 돌리기 (1~6)
		System.out.println((int)(Math.random()*6 + 1));
//		6개 숫자면 6가지, 10개 숫자면 10가지임!!!
		
		
//		예제 시작
		int num = (int) (Math.random() *6 + 1);

		if (num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		} 
		
	}
}
