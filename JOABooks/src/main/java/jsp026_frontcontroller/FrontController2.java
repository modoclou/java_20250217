package jsp026_frontcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.front")
public class FrontController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController2() { super(); }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doACtion(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doACtion(request, response);
	}
	
	protected void doACtion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String path = request.getServletPath();
		System.out.println("....."+path);
		
		if(path.equals("/a.front")) {System.out.println("A. a처리 컨트롤러 호출 B. View");}
		else if(path.equals("/b.front")) {System.out.println("A. b처리 컨트롤러 호출 B. View");}
		
	//	##4-1. 브라우저 띄우기 - ctrl + f11 : http://localhost:8080/JOABooks/*.front
	//	4-2. 브라우저 띄우기 - ctrl + f11 : http://localhost:8080/JOABooks/a.front	콘솔창확인
	//	4-3. 브라우저 띄우기 - ctrl + f11 : http://localhost:8080/JOABooks/b.front
	}
	
}
