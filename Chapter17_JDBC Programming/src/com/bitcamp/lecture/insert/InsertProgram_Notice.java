package com.bitcamp.lecture.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Member;
import com.bitcamp.lecture.comm.Notice;

public class InsertProgram_Notice {
	static final String URL = "jdbc:mysql://221.148.138.87:3306/lecture";
	static final String ID = "bitcamp";
	static final String PW = "1234";
//	static final String URL = "jdbc:mysql://localhost:3306/lecture";
//	static final String ID = "root";
//	static final String PW = "dkdlxl";
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement preStmt = null;
		
		// UI �� �������̽��� ���ؼ� CRUD ���� �����͸� ���� �޴´�.
		
		// scan �Ǵ� �� ��Ŀ� ���� �����Ͱ� �޾����ٰ� ����
		
		Notice notice = new Notice();
		notice.setTitle("�����λ�_INSERT����");
		notice.setWriterId("hayoon");
		notice.setHit(100);
		
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
			String sql = "Insert INTO notice(title,writer_id,hit)VALUES(?,?,?)";
			preStmt = con.prepareStatement(sql); // ������ ������ �� �ִ� ���� ��ü
			preStmt.setString(1, notice.getTitle());
			preStmt.setString(2, notice.getWriterId());
			preStmt.setInt(3, notice.getHit());
			
			// �Ʒ���ó�� ������������ ���������� ���Ե� �����ϴ�!
		
			/* PreparedStatement ��ü ��� ��
			 * int cnt = preStmt.executeUpdate(sql); (X)
			 * int cnt = preStmt.executeUpdate(); (O)
			 * <- ����!! �̷��� insert �� ���� ��ȣ�ȿ� sql�� �������� �ȵ�
			 */
			int cnt = preStmt.executeUpdate(); // select�� �����ϰ��� executeUpdate
			
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