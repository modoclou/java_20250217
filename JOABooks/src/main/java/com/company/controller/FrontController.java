package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		if(path.equals("/list.do")) {System.out.println("list.do : C:전체리스트	BList	/	V:list.jsp");}
		else if(path.equals("/write_view.do")) {System.out.println("write_view.do : 글쓰기 폼");
			// C: X			/	V:list.jsp
		}
		else if(path.equals("/write.do")) {System.out.println("write_view.do : 글쓰기 기능");
			// C: X			/	V:list.jsp
		}
		else if(path.equals("/detail.do")) {System.out.println("detail.do : 상세보기");
		//						V:detail.jsp
		}
		else if(path.equals("/edit_view.do")) {System.out.println("edit_view.do : 글 수정 폼");
		//						V:edit.jsp
		}
		else if(path.equals("/edit.do")) {System.out.println("edit.do : 글 수정");
		//						V:detail.do 
		}
		else if(path.equals("/delete.do")) {System.out.println("delete.do : 글 삭제");
		// C:해당번호			글삭제기능 BDelete(해당글삭제)	V: /list.do
		}
	}

}
