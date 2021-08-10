package reviewProblem.ch07;

public class ControllerExample {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.setService(new MemberService());
	}
}
