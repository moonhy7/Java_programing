package ch06_1_oop;

public class Student {
//	public static void main(String[] args) {
//		Contact con = new Contact();
//		con.setName("김자바");
//		System.out.println(con.getName());
//		
		int num = 0;
		
//		student() {	// 생성자가 필요한이유 
//					// 메인문돌때 가장 먼저 선언되어 값을 초기화하는등 작업을 해줌 
//		}			// 종류 : 데이터들(필드?)  생성자  메소드 끝임 
		
		Student() {
			num = 100;
		}	
		public int getNum() {
			return num;
		}
		
		public void setNum(int num) {
			this.num = num;
		}
	}

