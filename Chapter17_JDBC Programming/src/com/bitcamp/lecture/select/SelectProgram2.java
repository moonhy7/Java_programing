package com.bitcamp.lecture.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectProgram2 {
	
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
			
			String sql = "SELECT * FROM idol_group";
			rs = stmt.executeQuery(sql); // 실행 결과가 rs에 담김
			
			System.out.println("-------------------------------");
			System.out.println("COMPANY			GROUP_NAME					");
			System.out.println("-------------------------------");
			
			while(rs.next()) {
				System.out.println(rs.getString("COMPANY") + "\t\t" + rs.getString("GROUP_NAME"));
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
