package reviewProblem.ch08;

// 인터페이스
interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
}

// 구현 클래스 1
class OracleDao implements DataAccessObject {
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	public void update() {
		System.out.println("Oracle DB를 수정");
	}
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}

// 구현 클래스 2
class MySqlDao implements DataAccessObject {
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}
	public void update() {
		System.out.println("MySql DB를 수정");
	}
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}

// 실행 코드
public class DaoExample {
	// 매개값으로 인터페이스 타입을 받는 메소드 dbWork() 선언
	public static void dbWork(DataAccessObject dao) {
		dao.select(); // 인터페이스 내의 메소드 호출
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao()); // 매개값으로 OracleDao 객체를 넣어줌
		dbWork(new MySqlDao()); // 매개값으로 MySqlDao 객체를 넣어줌
	}
}
