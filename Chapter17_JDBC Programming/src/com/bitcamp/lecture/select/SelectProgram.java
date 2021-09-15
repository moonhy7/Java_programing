package com.bitcamp.lecture.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectProgram {
	
	static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	static final String ID = "bitcamp";
	static final String PW = "1234";
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
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
			
			String sql = "SELECT * FROM member";
			rs = stmt.executeQuery(sql); // 실행 결과가 rs에 담김
			
			System.out.println("-------------------------------");
			System.out.println("ID			PWD			NAME		GENDER");
			System.out.println("-------------------------------");
			
			while(rs.next()) {
				System.out.println(rs.getString("ID") + "\t\t" + rs.getString("PWD") + "\n");
			}
			
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					rs.close();
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
