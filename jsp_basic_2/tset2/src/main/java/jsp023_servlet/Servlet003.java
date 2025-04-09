package jsp023_servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet003
 */
// ctrl f11
@WebServlet("/hello")
public class Servlet003 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int initcnt = 1;
	int doGetCnt = 1;
	int destroyCnt = 1;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet003() { super(); }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("#1. init() 첫 요청에만 호출된다. > " + initcnt++);
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("#2. destroy() 가장 마지막에만 호출된다. > " + destroyCnt++);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("#2-1. get" + doGetCnt++);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("#2-2. post");
		//doGet(request, response);
	}

}
