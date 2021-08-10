package reviewProblem.ch06;
// ch06_3_#3
public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content) {
		this(title, content, "�α����� ȸ�����̵�", "���� ��ǻ�� ��¥", 0);
	}
	Board(String title, String content, String writer) {
		this(title, content, writer, "���� ��ǻ�� ��¥", 0);
	}
	Board(String title, String content, String writer,String date) {
		this(title, content, writer, date, 0);
	}
	Board(String title, String content, String writer,String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
