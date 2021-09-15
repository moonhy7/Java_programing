package com.bitcamp.lecture.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Member;
import com.bitcamp.lecture.comm.Notice;

public class DeleteProgram {
	static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	static final String ID = "bitcamp";
	static final String PW = "1234";
//	static final String URL = "jdbc:mysql://localhost:3306/lecture";
//	static final String ID = "root";
//	static final String PW = "dkdlxl";
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement preStmt = null;
		
		// UI 쪽 인터페이스를 통해서 CRUD 관련 데이터를 전달 받는다.
		
		// scan 또는 웹 양식에 의해 데이터가 받아졌다고 가정
		
		Notice notice = new Notice();
		notice.setId(41);
		
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
			String sql = "Delete FROM notice WHERE ID = ?";
			preStmt = con.prepareStatement(sql); // 문장을 실행할 수 있는 쿼리 객체
			preStmt.setInt(1, notice.getId());
			
			// 아래글처럼 대입하지말고 변수명으로 대입도 가능하다!
		
			/* PreparedStatement 객체 사용 시
			 * int cnt = preStmt.executeUpdate(sql); (X)
			 * int cnt = preStmt.executeUpdate(); (O)
			 * <- 주의!! 이렇게 insert 할 때는 괄호안에 sql이 들어가있으면 안됨
			 */
			int cnt = preStmt.executeUpdate(); // select를 제외하고는 executeUpdate
			
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
