package com.bitcamp.lecture.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Member;

public class InsertProgram_Member_direct {
	
	static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	static final String ID = "bitcamp";
	static final String PW = "1234";
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement preStmt = null;
		
		// UI 쪽 인터페이스를 통해서 CRUD 관련 데이터를 전달 받는다.
		
		// scan 또는 웹 양식에 의해 데이터가 받아졌다고 가정
		
		Member member = new Member();
		member.setId("♡♡♡♡");
		member.setPwd("*****");
		member.setName("테스터_문하윤");
		member.setGender("F");
		member.setBirthday("1996-06-01");
		member.setPhone("010-4964-3169");
		member.setEmail("moonhy7@naver.com");
		
		
		try {
			/* 드라이버 로딩
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			/* DB 연결
			 */
			con = DriverManager.getConnection(URL, ID, PW);
			System.out.println("Successfully Connection!");
			/* 쿼리 실행
			 */
			String sql = "INSERT INTO member(ID,PWD,NAME,GENDER,BIRTHDAY,PHONE,EMAIL)VALUES('moonhy77','00000','JDBC프로그래밍','F','1996-06-01','010-4964-3169','moonhy7@naver.com')";
			preStmt = con.prepareStatement(sql); // 문장을 실행할 수 있는 쿼리 객체
			
			
			// 아래글처럼 대입하지말고 변수명으로 대입도 가능하다!
		
			int cnt = preStmt.executeUpdate(sql); // select를 제외하고는 executeUpdate
			System.out.println("Query OK, " + cnt + "row affected");

			
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					preStmt.close();
					con.close();
					System.out.println("리소스 해제 완료");
				}
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			
		}
	}

}
