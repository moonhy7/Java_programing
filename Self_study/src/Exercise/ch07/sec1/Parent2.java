package Exercise.ch07.sec1;

public class Parent2 {
	// �ʵ�
	public String nation;
	
	// ������
	public Parent2() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	//������
	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
