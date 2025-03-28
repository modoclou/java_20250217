package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;

public class BDelete implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. utf-8
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//2. PARAMETER
		int bno = Integer.parseInt(request.getParameter("bno"));
		//3. SQL
		BoardDao dao = new BoardDao();
		
		//4. 결과 return	
		request.setAttribute("result", String.valueOf(dao.delete(bno)));
//		http://localhost:8080/JOABooks/detail.do?bno=37
	}

}
