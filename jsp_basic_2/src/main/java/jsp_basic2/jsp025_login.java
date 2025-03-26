package jsp_basic2;

import java.io.IOException;
import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class jsp025_join
 */
@WebServlet("/user")
public class jsp025_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jsp025_login() {
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
		//1. 데이터 넘겨받기
		//2. DBManager 연동
		//3. Sql 구문처리		 select cnt(*) from member where name=?, pass=?
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");		System.out.println(1);
		int result = -1;
		DBManager db = new DBManager();
		Connection conn = null; PreparedStatement pstmt = null;	ResultSet rset = null;
		String sql = "select cnt(*) from member where name=?, pass=?";
		try {			
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);					System.out.println(2);
			
			rset = pstmt.executeQuery();	// select - executeQuery / insert, update, delete - executeUpdate
			if(rset.next()) {result = rset.getInt("cnt");} //표의 (줄()){칸}
														System.out.println(3);
			if(result==1) {			
			HttpSession session = request.getSession();
			session.setAttribute("username", name);	//세션설정
			response.sendRedirect("jsp025_my.jsp");
			} else {
				if(result>0) {out.println("<script>alert('정보를 확인해주세요.'); history.go(-1); </script>");}
			}
		} catch(SQLException e) {e.printStackTrace();
		} finally {
			if(rset!=null) { try {rset.close();} catch(SQLException e) {e.printStackTrace();}}
			if(pstmt!=null) { try {pstmt.close();} catch(SQLException e) {e.printStackTrace();}}
			if(conn!=null) { try {conn.close();} catch(SQLException e) {e.printStackTrace();}}
		}
		//4. 결과처리 - 화면
	}
}
