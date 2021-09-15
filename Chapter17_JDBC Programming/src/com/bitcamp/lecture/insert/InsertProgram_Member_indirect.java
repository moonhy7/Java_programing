package com.bitcamp.lecture.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Member;

public class InsertProgram_Member_indirect {
	//static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	//static final String ID = "bitcamp";
	//static final String PW = "1234";
	static final String URL = "jdbc:mysql://localhost:3306/lecture";
	static final String ID = "root";
	static final String PW = "dkdlxl";
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement preStmt = null;
		
		// UI �� �������̽��� ���ؼ� CRUD ���� �����͸� ���� �޴´�.
		
		// scan �Ǵ� �� ��Ŀ� ���� �����Ͱ� �޾����ٰ� ����
		
		Member member = new Member();
		member.setId("����");
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
			String sql = "INSERT INTO member(ID,PWD,NAME,GENDER,BIRTHDAY,PHONE,EMAIL)VALUES(?,?,?,?,?,?,?)";
			preStmt = con.prepareStatement(sql); // ������ ������ �� �ִ� ���� ��ü
			// ?�� �����Ͷ� ���� �����ϱ�
			//DB�� �ε����� 0���Ͱ� �ƴ϶� 1���� ������
			preStmt.setString(1, member.getId());
			preStmt.setString(2, member.getPwd());
			preStmt.setString(3, member.getName());
			preStmt.setString(4, member.getGender());
			preStmt.setString(5, member.getBirthday());
			preStmt.setString(6, member.getPhone());
			preStmt.setString(7, member.getEmail());
			
			// �Ʒ���ó�� ������������ ���������� ���Ե� �����ϴ�!
		
			/* PreparedStatement ��ü ��� ��
			 * int cnt = preStmt.executeUpdate(sql); (X)
			 * int cnt = preStmt.executeUpdate(); (O)
			 * <- ����!! �̷��� insert �� ���� ��ȣ�ȿ� sql�� �������� �ȵ�
			 */
			int cnt = preStmt.executeUpdate(); // select�� �����ϰ�� executeUpdate
			
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
