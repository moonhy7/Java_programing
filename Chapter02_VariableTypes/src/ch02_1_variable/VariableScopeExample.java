package ch02_1_variable;
//p.55 변수의 사용범위
public class VariableScopeExample {
	
//	main 메소드 바깥에서 변수 생성하고 싶을때 
//	그냥 쓰면 에러생김
//	int 앞에 static 붙이면 에러 안남
	
	// int v1 = 15; 에러남 
	static int v1 = 15; // static의 유무 차이  
	
// public void main(String[] args) { ->static 안씀
	//static 안쓰면 메모리에 올라가질 못함
 public static void main(String[] args) {
//	 VariableScopeExample ve = new 
	 
//	 int v1 = 15;
	 System.out.println(v1);

	 if(v1 > 10) {
		 System.out.println(v1);
		 System.out.println(v1>10);
		 int v2;
		 v2 = v1 - 10;
		 System.out.println(v2);

	 }
//	 int v3 = v1 + v2 + 5;	//에러남
	 //에러나는 이유 : if문 안에서 선언된 v2는 if문 밖에서 쓸 수 없음
	 
	 System.out.println("v1: " + v1);
//	 System.out.println("v2: " + v2);

	 for(int i=0; i<10; i++) {
		 int v3 = 500;
		 System.out.println(i + "번째 " + v3);
	 }
	 
	 int num = 0;
	 
//	 .............
//	 System.out.println(v3);
//	 System.out.println("v1: " + v1);
//	 switch(num) {
//	 	double pi = 3.14;
//	 }
	 
	
	 
 }
}

class A {
	
	static int v1 = 15;
	void method() {
		
	}
}
