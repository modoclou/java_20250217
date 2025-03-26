package jsp_basic2;

import java.io.IOException;
import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jsp025_join
 */
@WebServlet("/user_join")
public class jsp025_join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jsp025_join() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		//1. 데이터 넘겨받기
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		//2. DBManager 연동
		DBManager db = new DBManager();
		Connection conn = db.getConnection();
		//3. Sql 구문처리		 select cnt(*) from member where name=?, pass=?
		PreparedStatement pstmt = null;	ResultSet rset = null;
		String sql = "insert into member (name, pass) values (?,?)"; //insert
		try{
			pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, pass);
		int result = pstmt.executeUpdate(); //insert, update, delete
		if(result>0) {out.println("<script>alert('회원가입 성공. 로그인해 주세요.'); location.href='jsp025_login.jsp';</script>");}
		} catch(SQLException e) {e.printStackTrace();
		} finally {
			if(pstmt!=null){ try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(conn!=null){ try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		//4. 경로처리
		//response.sendRedirect("jsp025_login.jsp");
		doGet(request, response);
	}
}
