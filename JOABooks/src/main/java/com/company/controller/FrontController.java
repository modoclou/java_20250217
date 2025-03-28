package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.service.BDelete;
import com.company.service.BDetail;
import com.company.service.BEdit;
import com.company.service.BEditView;
import com.company.service.BList;
import com.company.service.BWrite;
import com.company.service.BoardService;
import com.company.util.Naverbook;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")	//#1
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() { super(); }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response); //#2
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String path = request.getServletPath();
		System.out.println("......"+path);
		
		BoardService service = null; //##
		
//		Naverbook book = new Naverbook();
//		book.getBooks();
		
		if(path.equals("/list.do")) {
			service = new BList();	service.exec(request, response);
			request.getRequestDispatcher("board/list.jsp").forward(request, response);
			System.out.println("list.do : C:전체리스트	BList	/	V:list.jsp");
		}
		else if(path.equals("/write_view.do")) {
			// C: X					V:list.jsp
			request.getRequestDispatcher("board/write.jsp").forward(request, response);
			System.out.println("write_view.do : 글쓰기 폼");
		}
		else if(path.equals("/write.do")) {
			// C: 글삽입			BWrite(알림창- 성공/실패)	/	V: /list.do
			service = new BWrite();	service.exec(request, response);
			System.out.println("write_view.do : 글쓰기 기능");
//			System.out.println("1: " + request.getAttribute("result"));  1:1
			String result = (String)request.getAttribute("result");
			String msg = "관리자에게 문의하세요.";
			if(result.equals("1")) {
				msg="글쓰기에 성공했습니다.";
			}
			out.println("<script>alert('"+msg+"'); location.href='list.do';</script>");
		}
		else if(path.equals("/detail.do")) {
			// C: 해당번호 상세보기	BDetail(조회수올리기/해당글상세)
			service = new BDetail();	service.exec(request, response);
			request.getRequestDispatcher("board/detail.jsp").forward(request, response);
			System.out.println("detail.do : 상세보기");
		}
		else if(path.equals("/edit_view.do")) {System.out.println("edit_view.do : 글 수정 폼");
		//						V:update.jsp
			service = new BEditView();	service.exec(request, response);
			request.getRequestDispatcher("board/update.jsp").forward(request, response);
		}
		else if(path.equals("/edit.do")) {
			//						V:detail.do 
			service = new BEdit();	service.exec(request, response);
			String result = (String)request.getAttribute("result");
			String msg = "관리자에게 문의하세요.";
			if(result.equals("1")){ msg="글 수정에 성공했습니다."; }
			out.println("<script> alert('"+msg+"'); location.href='detail.do?bno="+request.getParameter("bno")+"';</script>");
			request.getRequestDispatcher("board/update.jsp").forward(request, response);
			System.out.println("edit.do : 글 수정");
		}
		else if(path.equals("/delete.do")) {System.out.println("delete.do : 글 삭제");
			// C:해당번호			글삭제기능 BDelete(해당글삭제)	V: /list.do
			service = new BDelete();	service.exec(request, response);
			request.getRequestDispatcher("board/detail.jsp").forward(request, response);
			String result = (String)request.getAttribute("result");
			String msg = "관리자에게 문의하세요.";
			if(result.equals("1")){ msg="글 삭제에 성공했습니다."; }
			out.println("<script> alert('"+msg+"'); location.href='list.do?bno=';</script>");
		}
	}

}
