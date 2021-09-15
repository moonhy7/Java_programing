package com.bitcamp.lecture.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertProgram_Member_1 {
	
	static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	static final String ID = "bitcamp";
	static final String PW = "1234";
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
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
			stmt = con.createStatement(); // 문장을 실행할 수 있는 쿼리 객체
			
			String sql = "INSERT INTO member(ID,PWD,NAME,GENDER)VALUES('moonhy72','00000','TESTER01','M')";
			int cnt = stmt.executeUpdate(sql); // select를 제외하고는 executeUpdate
			System.out.println("Query OK, " + cnt + "row affected");

			
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					stmt.close();
					con.close();
					System.out.println("리소스 해제 완료");
				}
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			
		}
	}

}
