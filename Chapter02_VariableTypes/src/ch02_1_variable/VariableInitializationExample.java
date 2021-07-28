package ch02_1_variable;
//p.51
public class VariableInitializationExample {
//	카멜표기법(대문자소문자섞어서=오르락내리락!)
	public static void main(String[] args) {
		
//변수선언p.48~
		int value = 1;
//		int val;
//		val = 1; 이렇게 써도 됨
		
//		int value; 이렇게만 선언해주면 오류나옴
//		오류 내용
//		The local variable value may not have been initialized
		
		int	result = value + 10;
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
		int x = 0;
		int y = 0;
		double z = 0.0; //이렇게 초기화를 해주고 시작하는게 정석
		
//		int aa= 0, bb = 0, cc = 0; 이렇게 한번에 선언가능
		int aa = 0;
		int bb = 0;
		int cc = 0;

		int a = 5; //변수 (변경가능)
		int b = 0; //변수
		final double pi = 3.141592; //상수
		

//		변수?
//		상수?
		a = 10; //(변경가능)
		a = 100;
//		pi = 0.01; 오류남.. 상수 선언 후 변경 불가
		System.out.println(a==b);
		int c = 0;
		b = a;
		
//		그렇다면 상수는 어떨때 쓰이나
//		한번 선언한 후 바꾸지않을때 유용함 
//		예)수식계산
		int r = 0;
		double area = r*r*3.141592;
//		이렇게 쓴 상황에서 전부 소숫점 두자리로 바꾸라고 하면
//		일일이 바꿔야하는 단점...
//		파이에다가 넣어놓으면 그것만 바꾸면 끝!
//		결론 : 자주 쓰는 상수는 맨 위에 한 번 선언해놓기
	}
}






