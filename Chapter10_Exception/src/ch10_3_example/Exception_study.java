package ch10_3_example;

public class Exception_study {
	
/**
* [오류]
* 	- 구문오류 : 치명적이지 않음(문법 오류 : 컴파일 시 수정 가능)
* 	- 논리오류 : 치명적임(개발자 코딩(문법적인 문제 제외) 오류 : 수식계산...
* 				(아무 에러도 안나지만 사용자가 원하는 값이 안나온 경우임)
* 	- 예      외 : 입력값, 입출력 관련, 물리적 장치 사용(누군가만.. 어떤 컴퓨터에서만..
* 				어떤 상황에서만 예외적으로 발생하는 오류..)
* 
* [예외를 처리한다?]
* 	- 무엇을 처리?
*  - 어디서 처리?
*  
*  예시 ) 파일 입출력 시 API 이용
*  	: API 함수에서 예외를 알아서 처리한다면...? (x)
* 	
* 		write() {								관리프로그램
* 			권한 (권한이 있나?)			오류발생		try
* 			파일존재 (파일이 있나?)     -------->  	write();
* 			파일용량 (여분이 있나?)		   보고		
* 			...					  throw 예외객체	catch	// try로 던지면 catch로 잡아서 처리해줌
* 												오류처리
*/
	
//		논리오류 예시1
//	circle_area = Math.PI * Math.pow(r, 3); // 원래는 Math.PI * Math.pow(r, 2) 인데
											// 개발자가 수식을 착각해서 잘못 적음
//		
//	}	
	
//		논리오류 예시2
//	if(Price < 0) { // 원래는 price > 0 이라고 써야하는데 부등호를 실수한 경우
//		buy();
//	}
}
