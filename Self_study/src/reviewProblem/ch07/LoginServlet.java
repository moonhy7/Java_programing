package reviewProblem.ch07;

public class LoginServlet extends HttpServlet {
	// 추상 메소드 재정의
	@Override
	public void service() {
		System.out.println("로그인 합니다.");
	}
}
