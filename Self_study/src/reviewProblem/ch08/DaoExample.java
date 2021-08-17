package reviewProblem.ch08;

// �������̽�
interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
}

// ���� Ŭ���� 1
class OracleDao implements DataAccessObject {
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}
	public void update() {
		System.out.println("Oracle DB�� ����");
	}
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
}

// ���� Ŭ���� 2
class MySqlDao implements DataAccessObject {
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	public void insert() {
		System.out.println("MySql DB�� ����");
	}
	public void update() {
		System.out.println("MySql DB�� ����");
	}
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
}

// ���� �ڵ�
public class DaoExample {
	// �Ű������� �������̽� Ÿ���� �޴� �޼ҵ� dbWork() ����
	public static void dbWork(DataAccessObject dao) {
		dao.select(); // �������̽� ���� �޼ҵ� ȣ��
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao()); // �Ű������� OracleDao ��ü�� �־���
		dbWork(new MySqlDao()); // �Ű������� MySqlDao ��ü�� �־���
	}
}
