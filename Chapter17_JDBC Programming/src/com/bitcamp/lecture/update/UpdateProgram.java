package com.bitcamp.lecture.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bitcamp.lecture.comm.Member;
import com.bitcamp.lecture.comm.Notice;

public class UpdateProgram {
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
		
		Notice notice = new Notice();
		notice.setId(48);
		notice.setTitle("�����λ�_UPDATE����");
		notice.setWriterId("hayoon");
		notice.setHit(777);
		
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
			String sql = "UPDATE notice SET TITLE = ?, WRITER_ID = ?, HIT = ? WHERE ID = ?";
			preStmt = con.prepareStatement(sql); // ������ ������ �� �ִ� ���� ��ü
			// ?�� �����Ͷ� ���� �����ϱ�
			//DB�� �ε����� 0���Ͱ� �ƴ϶� 1���� ������
			preStmt.setString(1, notice.getTitle());
			preStmt.setString(2, notice.getWriterId());
			preStmt.setInt(3, notice.getHit());
			preStmt.setInt(4, notice.getId());
			
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
