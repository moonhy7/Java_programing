package reviewProblem.ch07;

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());
	}
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
