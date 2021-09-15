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
			/* ����̹� �ε�
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
			/* DB ����
			 */
			con = DriverManager.getConnection(URL, ID, PW);
			System.out.println("Successfully Connection!");
			/* ���� ����
			 */
			stmt = con.createStatement(); // ������ ������ �� �ִ� ���� ��ü
			
			String sql = "SELECT * FROM idol_group";
			rs = stmt.executeQuery(sql); // ���� ����� rs�� ���
			
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
					System.out.println("���ҽ� ���� �Ϸ�");
				}
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			
		}
	}

}
