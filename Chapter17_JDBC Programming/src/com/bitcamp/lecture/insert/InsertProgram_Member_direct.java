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
		
		// UI �� �������̽��� ���ؼ� CRUD ���� �����͸� ���� �޴´�.
		
		// scan �Ǵ� �� ��Ŀ� ���� �����Ͱ� �޾����ٰ� ����
		
		Member member = new Member();
		member.setId("��������");
		member.setPwd("*****");
		member.setName("�׽���_������");
		member.setGender("F");
		member.setBirthday("1996-06-01");
		member.setPhone("010-4964-3169");
		member.setEmail("moonhy7@naver.com");
		
		
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
			String sql = "INSERT INTO member(ID,PWD,NAME,GENDER,BIRTHDAY,PHONE,EMAIL)VALUES('moonhy77','00000','JDBC���α׷���','F','1996-06-01','010-4964-3169','moonhy7@naver.com')";
			preStmt = con.prepareStatement(sql); // ������ ������ �� �ִ� ���� ��ü
			
			
			// �Ʒ���ó�� ������������ ���������� ���Ե� �����ϴ�!
		
			int cnt = preStmt.executeUpdate(sql); // select�� �����ϰ�� executeUpdate
			System.out.println("Query OK, " + cnt + "row affected");

			
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					preStmt.close();
					con.close();
					System.out.println("���ҽ� ���� �Ϸ�");
				}
			} catch(SQLException ex) {
				ex.printStackTrace();
			}
			
		}
	}

}
